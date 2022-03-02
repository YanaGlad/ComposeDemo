package com.example.composedemo.screens.algebra

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.screens.utils.CheckBoxWithText

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

        Text(
            text = "1) Что включает в себя понятие кольца?",
            modifier = Modifier
                .offset(x = 16.dp)
                .padding(top = 20.dp),
            fontSize = 16.sp,
        )

        CheckBoxWithText("Операция сложения +", 16, 8)
        CheckBoxWithText("Нейтральный элемент", 16, 8)
        CheckBoxWithText("Операция вычитания -", 16, 8)
        CheckBoxWithText("Обратимый элемент", 16, 8)
        CheckBoxWithText("Операция умножения *", 16, 8)

    }
}

