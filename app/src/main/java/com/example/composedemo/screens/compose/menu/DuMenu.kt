package com.example.composedemo.screens.compose.menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.screens.utils.MenuView

@Composable
fun DuMenu(navController: NavController) {
    MenuView(
        navController = navController,
        title = "Дифференциальные уравнения",
        destinationsMap = mapOf(
            "Подготовка за час" to IN_DEV,
            "Список вопросов к зачету" to IN_DEV,
            "Теория" to IN_DEV,
        )
    )
}