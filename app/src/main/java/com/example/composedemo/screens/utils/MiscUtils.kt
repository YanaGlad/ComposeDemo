package com.example.composedemo.screens.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.R

object MiscUtils {

    @Composable
    fun AnswerButton(condition: Boolean, onSuccess: () -> Unit = {}, onFail: () -> Unit = {}) {
        val visible = remember { mutableStateOf(true) }
        val check = remember { mutableStateOf(true) }
        if (visible.value) {
            Button(
                onClick = {
                    visible.value = false

                    if (condition) check.value = false

                    if (check.value) {
                        onSuccess()
                    } else {
                        onFail()
                    }
                },
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.transparent), contentColor = Color.Black)
            ) {
                Text(
                    text = "Ответить",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        } else {
            Text(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .fillMaxWidth(),
                text = if (check.value) "Верно" else "Не верно",
                fontSize = 20.sp,
                color = if (check.value) colorResource(R.color.green_correct) else Color.Red,
                textAlign = TextAlign.Center
            )
        }
    }
}