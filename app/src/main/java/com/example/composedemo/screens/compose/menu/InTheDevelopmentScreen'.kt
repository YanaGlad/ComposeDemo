package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.screens.utils.BasicNextButton

/*
 * @author Yana Glad
 */
@Composable
fun InTheDevelopmentScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center){
        Text(
            text = "Раздел в разработке",
            modifier = Modifier.offset(y = 16.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
        )
        BasicNextButton(navController, Navigation.MENU)
    }
}
