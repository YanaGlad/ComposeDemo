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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.Navigation.METHOD_COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.R
import com.example.composedemo.screens.utils.BasicNextButton
import com.example.composedemo.screens.utils.MenuView

@Composable
fun MethodComplexAScreen(navController: NavController) {
    MenuView(
        navController = navController,
        title = "Методы комплексного анализа",
        icon = R.drawable.ic_planet_saturn,
        destinationsMap = mapOf(
            "Подготовка за час" to IN_DEV,
            "Список вопросов к экзамену" to IN_DEV,
            "Теория" to IN_DEV,
            "Билеты с решениями" to METHOD_COMPLEX_ANALYSIS_TICKETS,
        )
    )
}