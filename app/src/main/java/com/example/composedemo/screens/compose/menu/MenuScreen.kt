package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.Navigation.ALGEBRA_MENU
import com.example.composedemo.Navigation.AUTOMAT_MENU
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_MENU
import com.example.composedemo.Navigation.CONTACT
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.Navigation.METHOD_COMPLEX_ANALYSIS_MENU
import com.example.composedemo.R
import com.example.composedemo.screens.utils.BasicNextButton

/*
 * @author Yana Glad
 */
@Composable
fun MenuScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.rocket_icon),
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .padding(top = 50.dp),
            contentDescription = "App theme",
        )
        Text(
            text = "RocketExam",
            modifier = Modifier.offset(y = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "Изи сессия",
            modifier = Modifier.padding(top = 16.dp),
            fontSize = 25.sp,
            textAlign = TextAlign.Center,
        )

        BasicNextButton(
            text = "Алгебра и геометрия",
            navController = navController,
            destination = ALGEBRA_MENU,
            padding = 5
        )
        BasicNextButton(
            text = "Автоматы и алгоритмы",
            navController = navController,
            destination = AUTOMAT_MENU,
            padding = 5
        )
        BasicNextButton(
            text = "Комплексный анализ",
            navController = navController,
            destination = COMPLEX_ANALYSIS_MENU,
            padding = 5
        )
        BasicNextButton(
            text = "Методы комплексного анализа",
            navController = navController,
            destination = METHOD_COMPLEX_ANALYSIS_MENU,
            padding = 5
        )
        BasicNextButton(
            text = "Связаться с автором",
            navController = navController,
            destination = CONTACT,
            padding = 10
        )
    }
}
