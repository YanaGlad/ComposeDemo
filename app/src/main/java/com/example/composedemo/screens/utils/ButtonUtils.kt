package com.example.composedemo.screens.utils

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
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
    ExtendedFloatingActionButton(
        onClick = { navController.navigate(destination) },
        modifier = Modifier
            .padding(top = padding.dp)
            .fillMaxWidth(),

        backgroundColor = colorResource(R.color.purple_700),
        text = {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = text,
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier.weight(5f),
                )
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_right),
                    modifier = Modifier
                        .width(20.dp)
                        .height(20.dp)
                        .weight(1f)
                        .align(CenterVertically),
                    contentDescription = "App theme",
                    alignment = Alignment.CenterEnd,
                )
            }
        }
    )
}

@Composable
fun ButtonExtendableAnswer(text: String, answerText: String, padding: Int = 20) {
    var isExpanded by remember { mutableStateOf(false) }

    Column(modifier = Modifier.animateContentSize(
        animationSpec = tween(
            durationMillis = 500,
            easing = LinearOutSlowInEasing
        )
    )) {
        Box(
            modifier = Modifier
                .padding(padding.dp)
                .fillMaxWidth()
                .border(
                    border = BorderStroke(5.dp, colorResource(id = R.color.answer_button_color)),
                    shape = RoundedCornerShape(15f)
                )
                .clickable(
                    onClick = { isExpanded = !isExpanded }
                ),
        ) {
            Text(
                text = text,
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier.padding(padding.dp)
            )

        }
        if (isExpanded) {
            Text(
                text = answerText,
                fontSize = 12.sp,
                color = Color.Black,
                modifier = Modifier.padding(padding.dp)
            )
        }
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
