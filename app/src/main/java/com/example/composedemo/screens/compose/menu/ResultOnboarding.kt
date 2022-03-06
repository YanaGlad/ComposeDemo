package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
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
import com.example.composedemo.R


/*
 * @author Yana Glad
 */
@Composable
fun ResultOnboarding(navController: NavController,  totalAnswerCount: Int) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(
            imageVector = ImageVector.vectorResource(R.drawable.ic_rocket),
            modifier = Modifier
                .width(400.dp)
                .height(400.dp)
                .padding(top = 50.dp),
            contentDescription = "Finish",
        )

        Text(
            modifier = Modifier.offset(y = 16.dp),
            text = "Тест пройден, правильно /$totalAnswerCount",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )
    }
}