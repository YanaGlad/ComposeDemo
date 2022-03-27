package com.example.composedemo.screens.utils

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
@Composable
fun CheckBoxWithText(text: String, fontSize: Int, padding: Int, checkedState: MutableState<Boolean>) {
    Row {
        Checkbox(
            modifier = Modifier
                .offset(x = 16.dp)
                .padding(top = 8.dp),
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it },
            colors = CheckboxDefaults.colors(
                checkedColor = colorResource(id = R.color.purple_700),
                checkmarkColor = colorResource(id = R.color.answer_button_color)
            )
        )
        Text(
            text = text,
            fontSize = fontSize.sp,
            modifier = Modifier
                .offset(x = 18.dp)
                .padding(top = padding.dp),
        )
    }
}

@Composable
fun QuizCheckBox(
    quizTitle: String, countCheckBox: Int, listOfNames: List<String>,
    correctIndexes: List<Int>, onSuccess: () -> Unit = {}, onFail: () -> Unit = {}, onFinally: () -> Unit = {},
) {
    Text(
        text = quizTitle,

        modifier = Modifier
            .offset(x = 16.dp)
            .padding(top = 14.dp),
        fontSize = 16.sp,
    )

    val checkStates = arrayListOf<MutableState<Boolean>>()

    for (i in 0..countCheckBox) {
        checkStates.add(remember { mutableStateOf(false) })
    }

    for (i in 0 until countCheckBox) {
        CheckBoxWithText(listOfNames[i], 16, 8, checkStates[i])
    }

    var condition = true
    for (index in 0 until countCheckBox) {
        if (index !in correctIndexes && checkStates[index].value) condition = false
        if (index in correctIndexes && !checkStates[index].value) condition = false
    }
    AnswerButton(
        condition = condition,
        onSuccess = onSuccess,
        onFail = onFail,
        onFinally = onFinally
    )
}
