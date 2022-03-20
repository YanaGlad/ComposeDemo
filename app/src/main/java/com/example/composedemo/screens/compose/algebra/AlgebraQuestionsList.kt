package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
import androidx.navigation.NavController
import com.example.composedemo.R
import com.example.composedemo.screens.utils.ButtonExtendableAnswer

@Composable
fun AlgebraQuestionsList(navController: NavController) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Row(modifier = Modifier
            .align(Alignment.Start)) {

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
                    .padding(top = 50.dp)
                    .weight(1f),
                contentDescription = "App theme",
            )
        }

        ButtonExtendableAnswer(
            text = "1 - Определения кольца, ассоциативного кольца, коммутативного кольца, кольца с\n" +
                    "единицей.",
            answerText = "КОЛЬЦО R – это абелева группа (в аддитивной записи, т.е. с операцией +, называемой сложением, и нейтральным элементом 0), в которой имеется вторая " +
                    "операция – умножение. \n \n Причем операции сложения и умножения связаны дистрибутивностью: \n" +
                    "\n a(b + c) = ab + ac,\n" +
                    "(b + c)a = ba + ca." +
                    "\n \n " +
                    "Кольцо называется АССОЦИАТИВНЫМ, если операция умножения ассоциативна, т.е.\n \n" +
                    "a(bc) = (ab)c, ∀ a, b, c ∈ R" +
                    "\n \n" +
                    "Кольцо называется КОММУТАТИВНЫМ, если умножение коммутативно, т.е. \n \n " +
                    "ab = ba, ∀ a, b ∈ R" +
                    "\n \n" +
                    "Если по отношению к умножению имеется в кольце нейтральный элемент,\n" +
                    "который называют единицей и обозначают как 1, то такое кольцо называют КОЛЬЦОМ\n" +
                    "С ЕДИНИЦЕЙ."
        )

        ButtonExtendableAnswer(
            text = "2 - Тела, поля, подкольца, подполя.",
            answerText = "",
        )
    }
}