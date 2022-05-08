package com.example.composedemo.screens.compose.menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.R
import com.example.composedemo.screens.utils.MenuView

@Composable
fun AutomatMenu(navController: NavController) {
    MenuView(
        navController = navController,
        title = "Теория автоматов",
        icon = R.drawable.ic_robot,
        destinationsMap = mapOf(
            "Подготовка за час" to IN_DEV,
            "Список вопросов к экзамену" to IN_DEV,
            "Теория" to IN_DEV,
            "Дз для получения зачета" to IN_DEV,
        )
    )
}