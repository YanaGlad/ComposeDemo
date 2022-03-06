package com.example.composedemo.screens.algebra

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.screens.utils.CheckBoxUtils.CheckBoxWithText
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
    }
}

fun showFail() {
    println("NO")
}

fun showSuccess() {
    println("YES")
}

