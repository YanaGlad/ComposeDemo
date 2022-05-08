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
import com.example.composedemo.Navigation
import com.example.composedemo.Navigation.ALGEBRA_QUESTION_LIST
import com.example.composedemo.Navigation.ALGEBRA_THEORY
import com.example.composedemo.Navigation.ALGEBRA_TICKETS
import com.example.composedemo.Navigation.RING_DESCRIPTION
import com.example.composedemo.R
import com.example.composedemo.screens.utils.BasicNextButton
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
