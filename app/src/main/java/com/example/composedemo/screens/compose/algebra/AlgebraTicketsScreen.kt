package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.R
import com.example.composedemo.screens.utils.TicketImage
import com.example.composedemo.screens.utils.TicketsScreen

/*
 * @author Yana Glad
 */
@Composable
fun AlgebraTickets(navController: NavController) {
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
        numberCount = 4
    )
}
