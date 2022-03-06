package com.example.composedemo.screens.utils

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
object CheckBoxUtils {

    @Composable
    fun CheckBoxWithText(text: String, fontSize: Int, padding: Int, checkedState: MutableState<Boolean>) {
        Row {
            Checkbox(
                modifier = Modifier
                    .offset(x = 16.dp)
                    .padding(top = 8.dp),
                checked = checkedState.value,
                onCheckedChange = { checkedState.value = it }
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
        correctIndexes: List<Int>, onSuccess: () -> Unit = {}, onFail: () -> Unit = {},
    ) {

        Text(
            text = quizTitle,
            modifier = Modifier
                .offset(x = 16.dp)
                .padding(top = 20.dp),
            fontSize = 16.sp,
        )

        val checkStates = arrayListOf<MutableState<Boolean>>()

        for (i in 0..countCheckBox) {
            checkStates.add(remember { mutableStateOf(false) })
        }

        CheckBoxWithText(listOfNames[0], 16, 8, checkStates[0])
        CheckBoxWithText(listOfNames[1], 16, 8, checkStates[1])
        CheckBoxWithText(listOfNames[2], 16, 8, checkStates[2])
        CheckBoxWithText(listOfNames[3], 16, 8, checkStates[3])
        CheckBoxWithText(listOfNames[4], 16, 8, checkStates[4])

        val visible = remember { mutableStateOf(true) }
        val check = remember { mutableStateOf(true) }
        if (visible.value) {
            Button(
                onClick = {
                    visible.value = false
                    for (index in 0 until countCheckBox) {
                        if (index !in correctIndexes && checkStates[index].value) check.value = false
                        if (index in correctIndexes && !checkStates[index].value) check.value = false
                    }
                    if (check.value) {
                        onSuccess()
                    } else {
                        onFail()
                    }
                },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.transparent), contentColor = Color.Black)
            ) {
                Text(
                    text = "ОК",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        } else {
            Text(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                text = if (check.value) "Верно" else "Не верно",
                fontSize = 20.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }
}
