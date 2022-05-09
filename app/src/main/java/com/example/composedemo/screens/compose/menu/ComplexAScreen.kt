package com.example.composedemo.screens.compose.menu

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_QUESTION_LIST
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_TR
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.Navigation.MENU
import com.example.composedemo.R
import com.example.composedemo.screens.utils.MenuView

@Composable
fun ComplexAScreen(navController: NavController) {
    BackHandler {
        navController.navigate(MENU)
    }

    MenuView(
        navController = navController,
        title = "Комплексный анализ",
        icon = R.drawable.ic_alien,
        destinationsMap = mapOf(
            "Подготовка за час" to IN_DEV,
            "Типовой расчет" to COMPLEX_ANALYSIS_TR,
            "Список вопросов к зачету" to COMPLEX_ANALYSIS_QUESTION_LIST,
            "Теория" to IN_DEV,
            "Билеты с решениями" to COMPLEX_ANALYSIS_TICKETS,
        )
    )
}