package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.R
/*
 * @author Yana Glad
 */
@Composable
fun ResultOnboarding(navController: NavController, totalAnswerCount: Int, correctAnswerCount: Int, next: String) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            imageVector = ImageVector.vectorResource(R.drawable.ic_rocket),
            modifier = Modifier
                .width(400.dp)
                .height(400.dp)
                .padding(top = 50.dp),
            contentDescription = "Finish",
        )
        Text(
            modifier = Modifier.padding(top = 16.dp),
            text = "Тест пройден, правильно $correctAnswerCount/$totalAnswerCount",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )

        Row(modifier = Modifier.padding(top = 50.dp)) {
            Column {
                Card(shape = RoundedCornerShape(70.dp)) {
                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.ic_space_earth),
                        modifier = Modifier
                            .width(125.dp)
                            .height(125.dp)
                            .clickable(
                                enabled = true,
                                onClick = { navController.navigate(Navigation.MENU) }
                            ),
                        contentDescription = "Go home",
                        alignment = Alignment.Center
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .offset(x = (-30).dp),
                    text = "Домашнаяя страница",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Start
                )
            }
            Column {
                Card(
                    shape = RoundedCornerShape(70.dp),
                    modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.ic_next),
                        modifier = Modifier
                            .width(125.dp)
                            .height(125.dp)
                            .clickable(
                                enabled = true,
                                onClick = { navController.navigate(next) },
                            ),
                        contentDescription = "Go home",
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .offset(x = 27.dp),
                    text = "Дальше",
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
