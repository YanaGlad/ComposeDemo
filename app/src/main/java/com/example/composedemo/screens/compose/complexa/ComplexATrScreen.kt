package com.example.composedemo.screens.compose.complexa

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.R
import com.example.composedemo.screens.utils.ButtonExtendableAnswer

@Composable
fun ComplexATrScreen(navController: NavController) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Задание 1",
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = "Найти все значения параметра alpha, при которых сходится интеграл",
            textAlign = TextAlign.Center,
            fontSize = 15.sp,
        )

        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.ca_tr_1_task),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 20.dp),
            contentDescription = "ca_tr_1_task",
        )

        ButtonExtendableAnswer(
            text = "Решение варианта 7",
            answerText = "",
        )
        ButtonExtendableAnswer(
            text = "Решение варианта 17",
            answerText = "",
        )
    }
}