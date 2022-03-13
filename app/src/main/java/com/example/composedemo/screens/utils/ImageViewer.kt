package com.example.composedemo.screens.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
@Composable
fun ImageViewer(navController: NavController, destination: String, image: Int) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Box(modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .offset(y = (-40).dp)
                .align(Alignment.End)
                .clickable(
                    enabled = true,
                    onClick = {
                       navController.navigate(destination)
                    }
                )) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_cancel),
                    modifier = Modifier
                        .width(400.dp)
                        .height(400.dp)
                        .padding(top = 50.dp),
                    contentDescription = "Finish",
                )
            }

            ZoomableImage(
                painter = painterResource(id = image),
                isRotation = false,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}