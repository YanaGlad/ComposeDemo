package com.example.composedemo.screens.compose.mcomplexa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R
import com.example.composedemo.screens.utils.ButtonExtendableAnswer
import com.example.composedemo.screens.utils.ExtImage

@Composable
fun MComplexAQuestionList() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Row(modifier = Modifier.align(Alignment.Start)) {

            Column(modifier = Modifier.weight(2.5f)) {
                Text(
                    text = "Вопросы к экзамену",
                    modifier = Modifier
                        .offset(y = 20.dp, x = 10.dp)
                        .align(Alignment.CenterHorizontally),
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                )
                Text(
                    text = "Нажми на вопрос, чтобы посмотреть ответ",
                    modifier = Modifier
                        .offset(y = 50.dp, x = 30.dp)
                        .width(200.dp),
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                )
            }
            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_orbit),
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(top = 30.dp, end = 20.dp)
                    .weight(1f),
                contentDescription = "App theme",
            )
        }
        
        Text(
            text = "Вопросы для устного/письменного опроса по разделу 1. Несобственные интегралы",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
        )

        ButtonExtendableAnswer(
            text = "1 - Несобственные интегралы с бесконечными пределами интегрирования и от\n" +
                    "неограниченных функций",
            answerText = mapOf(
                "ИНТЕГРАЛЫ С БЕСКОНЕЧНЫМИ ПРЕДЕЛАМИ \n" to null,
                "Пусть функция f (x) непрерывна на промежутке [a; +inf), тогда по определению " to ExtImage(path = R.drawable.ca_answer_1, height = 150),
                "Если существует конечный предел в правой части этого равенства, то несобственный интеграл в левой части указанного равенства называется\n" +
                        "СХОДЯЩИМСЯ, если такой предел не существует, то – РАСХОДЯЩИМСЯ." to null,
                "\n" to null,
                "ИНТЕГРАЛЫ ОТ НЕОГРАНИЧЕННЫХ ФУНКЦИЙ \n" to null,
                "Пусть функция f(x) непрерывна на промежутке [a;b) и lim f(x) при x->b-0 = inf. Тогда по определению "  to ExtImage(path = R.drawable.ca_answer_2, height = 150),
                "Если существует конечный предел в правой части этого равенства, то несобственный интеграл в левой части указанного равенства называется\n" +
                        "сходящимся, если такой предел не существует, то – расходящимся." to null
            )
        )

        ButtonExtendableAnswer(
            text = "2 - Признаки сходимости несобственных интегралов",
            answerText = mapOf()
        )
    }
}