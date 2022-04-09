package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.R
import com.example.composedemo.screens.utils.BasicNextButton

@Composable
fun ComplexAScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.align(Alignment.End)) {
            Text(
                text = "Комплексный анализ(интегралы с параметром)",
                modifier = Modifier.offset(y = 95.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )
            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_satellite),
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(top = 50.dp),
                contentDescription = "App theme",
            )
        }
        BasicNextButton(
            text = "Подготовка за час",
            navController = navController,
            destination = "None",
            padding = 5
        )
        BasicNextButton(
            text = "Список вопросов к экзамену",
            navController = navController,
            destination = "None",
            padding = 5
        )

        BasicNextButton(
            text = "Теория",
            navController = navController,
            destination = "None",
            padding = 5
        )

        BasicNextButton(
            text = "Билеты с решениями",
            navController = navController,
            destination = "None",
            padding = 5
        )
    }
}