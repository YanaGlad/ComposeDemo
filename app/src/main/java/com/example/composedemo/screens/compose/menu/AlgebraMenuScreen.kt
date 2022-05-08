package com.example.composedemo.screens.compose.menu

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.ALGEBRA_QUESTION_LIST
import com.example.composedemo.Navigation.ALGEBRA_THEORY
import com.example.composedemo.Navigation.ALGEBRA_TICKETS
import com.example.composedemo.Navigation.RING_DESCRIPTION
import com.example.composedemo.R
import com.example.composedemo.screens.utils.MenuView

/*
 * @author Yana Glad
 */
@Composable
fun AlgebraMenuScreen(navController: NavController) {
    MenuView(
        navController = navController,
        title = "Алгебра",
        icon = R.drawable.ic_satellite,
        destinationsMap = mapOf(
            "Подготовка за час" to RING_DESCRIPTION,
            "Список вопросов к экзамену" to ALGEBRA_QUESTION_LIST,
            "Теория" to ALGEBRA_THEORY,
            "Билеты с решениями" to ALGEBRA_TICKETS,
        )
    )
}
