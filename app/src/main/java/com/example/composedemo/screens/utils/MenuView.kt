package com.example.composedemo.screens.utils

import androidx.appcompat.view.menu.MenuView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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

@Composable
fun MenuView(navController: NavController, title: String, destinationsMap: Map<String, String>) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = Modifier.align(Alignment.End)) {
            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_signal),
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(top = 20.dp)
                    .align(Alignment.CenterHorizontally),
                contentDescription = "App theme",
            )
            Text(
                text = title,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
            )
        }

        destinationsMap.forEach { entry ->
            BasicNextButton(
                text = entry.key,
                navController = navController,
                destination = entry.value,
                padding = 5
            )
        }
    }
}