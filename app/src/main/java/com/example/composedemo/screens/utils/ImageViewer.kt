package com.example.composedemo.screens.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
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
            Card(modifier = Modifier
                .width(70.dp)
                .height(70.dp)
                .align(Alignment.End),
                shape = RoundedCornerShape(70.dp)
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_cancel),
                    modifier = Modifier
                        .widthIn()
                        .heightIn()
                        .clickable(
                            enabled = true,
                            onClick = {
                                navController.navigate(destination)
                            }
                        ),
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