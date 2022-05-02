package com.example.composedemo.screens.compose.mcomplexa

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.METHOD_COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.screens.utils.TicketImage
import com.example.composedemo.screens.utils.TicketsScreen

@Composable
fun MComplexTicketsScreen(navController: NavController) {
    TicketsScreen(
        navController = navController,
        images = listOf(
            TicketImage.mca_1, TicketImage.mca_2, TicketImage.mca_4, TicketImage.mca_5, TicketImage.mca_6, TicketImage.mca_7,
            TicketImage.mca_8, TicketImage.mca_9, TicketImage.mca_10, TicketImage.mca_11, TicketImage.mca_12, TicketImage.mca_13,
            TicketImage.mca_14, TicketImage.mca_15, TicketImage.mca_16, TicketImage.mca_17,
        ),
        numberCount = 6,
        backDestination = METHOD_COMPLEX_ANALYSIS_TICKETS,
    )
}