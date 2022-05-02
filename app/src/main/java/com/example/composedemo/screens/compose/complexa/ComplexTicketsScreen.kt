package com.example.composedemo.screens.compose.complexa

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.screens.utils.TicketImage
import com.example.composedemo.screens.utils.TicketsScreen

@Composable
fun ComplexTicketsScreen(navController: NavController) {
    TicketsScreen(
        navController = navController,
        images = listOf(
            TicketImage.ca_first, TicketImage.ca_fouth, TicketImage.ca_fifth, TicketImage.ca_sixth
        ),
        numberCount = 7,
        backDestination = COMPLEX_ANALYSIS_TICKETS,
    )
}