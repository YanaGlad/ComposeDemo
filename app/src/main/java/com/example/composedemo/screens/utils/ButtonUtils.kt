package com.example.composedemo.screens.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.R
import org.intellij.lang.annotations.JdkConstants

/*
 * @author Yana Glad
 */
@Composable
fun BasicNextButton(navController: NavController, destination: String, padding: Int = 50, text: String = "Дальше") {
    Button(
        onClick = { navController.navigate(destination) },
        modifier = Modifier
            .padding(top = padding.dp)
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.purple_700), contentColor = Color.Black)
    ) {
        Text(
            text = text,
            fontSize = 20.sp,
            color = Color.White
        )
    }
}

@Composable
fun AnswerButton(condition: Boolean, onSuccess: () -> Unit = {}, onFail: () -> Unit = {}, onFinally: () -> Unit = {}) {
    val visible = remember { mutableStateOf(true) }
    val check = remember { mutableStateOf(true) }
    if (visible.value) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            ExtendedFloatingActionButton(
                text = {
                    Text(
                        text = "Ответить",
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                },
                onClick = {
                    visible.value = false

                    check.value = condition

                    if (check.value) {
                        onSuccess()
                    } else {
                        onFail()
                    }
                    onFinally()
                },
                modifier = Modifier
                    .padding(top = 5.dp)
                    .height(45.dp)
                    .wrapContentWidth(),
                backgroundColor = colorResource(R.color.answer_button_color),
                contentColor = Color.Black
            )
        }

    } else {
        Text(
            modifier = Modifier
                .padding(top = 5.dp)
                .fillMaxWidth(),
            text = if (check.value) "Верно" else "Не верно",
            fontSize = 20.sp,
            color = if (check.value) colorResource(R.color.green_correct) else Color.Red,
            textAlign = TextAlign.Center
        )
    }
}
