package com.example.composedemo.screens.compose.algebra

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.Navigation.ALGEBRA_TICKETS
import com.example.composedemo.screens.utils.TicketImage
import com.example.composedemo.screens.utils.TicketsScreen

/*
 * @author Yana Glad
 */
@Composable
fun AlgebraTickets(navController: NavController) {
    BackHandler {
        navController.navigate(Navigation.ALGEBRA_MENU)
    }
    TicketsScreen(
        navController = navController,
        images = listOf(
            TicketImage.first_algebra, TicketImage.second_algebra, TicketImage.third_algebra,
            TicketImage.fouth_algebra, TicketImage.fifth_algebra, TicketImage.sixth_algebra, TicketImage.seventh_algebra,
            TicketImage.eighth_algebra, TicketImage.nineth_algebra, TicketImage.tenth_algebra, TicketImage.eleventh_algebra,
            TicketImage.twelvth_alebra, TicketImage.thirteenth_algebra, TicketImage.fourteenth_algebra,
            TicketImage.fifteenth_algebra, TicketImage.sixteenth_algebra, TicketImage.seventeenth_algebra,
            TicketImage.eighteenth_algebra, TicketImage.nineteenth_algebra, TicketImage.twentieth_algebra,
            TicketImage.twentyfifth_algebra, TicketImage.twentysecond_algebra, TicketImage.twentythird_algebra,
            TicketImage.twentyfouth_algebra, TicketImage.twentyfifth_algebra, TicketImage.twentysixth_algebra,
            TicketImage.twentyseventh_algebra, TicketImage.twentyeighth_algebra, TicketImage.twentynineth_algebra,
        ),
        numberCount = 4,
        backDestination = ALGEBRA_TICKETS,
    )
}
