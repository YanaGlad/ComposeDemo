package com.example.composedemo.screens.compose.menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.Navigation.DU_QUESTION_LIST
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.R
import com.example.composedemo.screens.utils.MenuView

@Composable
fun ComplexAScreen(navController: NavController) {
    MenuView(
        navController = navController,
        title = "Комплексный анализ",
        icon = R.drawable.ic_alien,
        destinationsMap = mapOf(
            "Подготовка за час" to IN_DEV,
            "Список вопросов к зачету" to DU_QUESTION_LIST,
            "Теория" to IN_DEV,
            "Билеты с решениями" to COMPLEX_ANALYSIS_TICKETS,
        )
    )
}