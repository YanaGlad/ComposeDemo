package com.example.composedemo.screens.algebra

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.screens.utils.CheckBoxUtils.QuizCheckBox

/*
 * @author Yana Glad
 */
@Composable
fun RingDescribeScreenQuiz() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        Text(
            text = "Отлично! Теперь пройди короткий тест на знание базовых понятий о кольцах",
            modifier = Modifier.offset(y = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textAlign = TextAlign.Center
        )

        QuizCheckBox(
            quizTitle = "1) Что включает в себя понятие кольца?",
            countCheckBox = 5,
            listOfNames = listOf("Операция сложения +", "Нейтральный элемент",
                "Операция вычитания -", "Обратимый элемент", "Операция умножения *"),
            correctIndexes = listOf(0, 1, 4),
            onSuccess = { showSuccess() },
            onFail = { showFail() }
        )

        Text(
            text = "2) Какое кольцо называется коммутативным?",
            modifier = Modifier
                .offset(x = 16.dp)
                .padding(top = 20.dp, bottom = 20.dp),
            fontSize = 16.sp,
        )

        Column(Modifier.selectableGroup())
        {
            val state = remember { mutableStateOf(true) }
            val change = { state.value = !state.value }

            Row {
                RadioButton(
                    selected = state.value,
                    onClick = { state.value = true },
                    modifier = Modifier
                        .offset(x = 16.dp)
                        .padding(top = 1.dp)
                )
                Text(
                    modifier = Modifier.offset(x = 18.dp),
                    text = "Kotlin",
                    fontSize = 16.sp
                )
            }
            Row {
                RadioButton(
                    selected = !state.value,
                    onClick = { state.value = false },
                    modifier = Modifier
                        .offset(x = 16.dp)
                        .padding(top = 1.dp)
                )
                Text(
                    modifier = Modifier.offset(x = 18.dp),
                    text = "Java",
                    fontSize = 16.sp)
            }
        }
    }
}

fun showFail() {
    println("NO")
}

fun showSuccess() {
    println("YES")
}

