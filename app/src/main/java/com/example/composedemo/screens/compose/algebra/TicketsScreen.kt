package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
typealias TicketImage = R.drawable
@Composable
fun TicketsScreen(navController: NavController) {
    Column {
        Row(modifier = Modifier.align(Alignment.Start)) {
            Column {
                Text(
                    text = "Билеты",
                    modifier = Modifier.offset(y = 50.dp, x = 50.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                )
                Text(
                    text = "Нажми на билет, чтобы посмотреть решение. Так же можно отфильтровать решения по номеру задачи",
                    modifier = Modifier
                        .offset(y = 50.dp, x = 20.dp)
                        .width(200.dp),
                    fontSize = 13.sp,
                    textAlign = TextAlign.Center
                )
            }

            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_telescope),
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(top = 50.dp),
                contentDescription = "App theme",
            )
        }

        Row(modifier = Modifier
            .padding(top = 8.dp)
            .horizontalScroll(rememberScrollState())
        ) {
            SimpleButton("Список билетов")
            SimpleButton("Номер 1")
            SimpleButton("Номер 2")
            SimpleButton("Номер 3")
            SimpleButton("Номер 4")
        }

        val images = listOf(TicketImage.first_algebra, TicketImage.second_algebra, TicketImage.third_algebra)
        val scale = listOf(remember { mutableStateOf(1f) })

        var i = 1
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            images.forEach {
                TicketView(it, i++)
            }
        }
    }
}

@Composable
private fun TicketView(image: Int, number: Int) {
    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Билет $number",
            modifier = Modifier.padding(top = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Image(
            bitmap = ImageBitmap.imageResource(image),
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentDescription = "ticket $number",
        )
    }
}

@Composable
private fun SimpleButton(text: String) {
    Button(
        modifier = Modifier.padding(start = 8.dp),
        onClick = { }
    ) {
        Text(text = text)
    }
}