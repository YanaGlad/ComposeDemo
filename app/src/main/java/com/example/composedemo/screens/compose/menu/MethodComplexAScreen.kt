package com.example.composedemo.screens.compose.menu

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.Navigation.METHOD_COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.R
import com.example.composedemo.screens.utils.MenuView

@Composable
fun MethodComplexAScreen(navController: NavController) {
    BackHandler {
        navController.navigate(Navigation.MENU)
    }

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