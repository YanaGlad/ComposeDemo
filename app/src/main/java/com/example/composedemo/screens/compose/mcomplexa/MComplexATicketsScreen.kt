package com.example.composedemo.screens.compose.mcomplexa

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.screens.utils.TicketImage
import com.example.composedemo.screens.utils.TicketsScreen

@Composable
fun MComplexTicketsScreen(navController: NavController) {
    TicketsScreen(
        navController = navController,
        images = listOf(
            TicketImage.mca_1,
        ),
        numberCount = 6
    )
}