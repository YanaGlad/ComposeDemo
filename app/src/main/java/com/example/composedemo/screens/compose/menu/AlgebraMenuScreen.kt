package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.R
import com.example.composedemo.screens.utils.ButtonUtils

/*
 * @author Yana Glad
 */
@Composable
fun AlgebraMenuScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row ( modifier = Modifier.align(Alignment.End)) {
            Text(
                text = "Алгебра 4 семестр",
                modifier = Modifier.offset(y = 95.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
            )

            Image(
                imageVector = ImageVector.vectorResource(R.drawable.ic_satellite),
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .padding(top = 50.dp) ,
                contentDescription = "App theme",
            )
        }
        ButtonUtils.BasicNextButton(
            text = "Подготовка за час",
            navController = navController,
            destination = Navigation.RING_DESCRIPTION,
            padding = 25
        )

        ButtonUtils.BasicNextButton(
            text = "Теория",
            navController = navController,
            destination = Navigation.ALGEBRA_THEORY,
            padding = 25
        )

        ButtonUtils.BasicNextButton(
            text = "Билеты с решениями",
            navController = navController,
            destination = Navigation.ALGEBRA_TICKETS,
            padding = 25
        )
    }
}
