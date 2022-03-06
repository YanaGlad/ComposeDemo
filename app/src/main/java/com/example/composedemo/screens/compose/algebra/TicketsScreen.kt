package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
@Composable
fun TicketsScreen(navController: NavController) {
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

    Column {
        val images = listOf(R.drawable.first_algebra)
        // TODO адрес картинок
        // Через for each. Создать сущность проверки номера
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
