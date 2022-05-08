package com.example.composedemo.screens.utils

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
@Composable
fun BasicNextButton(navController: NavController, destination: String, padding: Int = 50, text: String = "Дальше") {
    ExtendedFloatingActionButton(
        onClick = { navController.navigate(destination) },
        modifier = Modifier
            .padding(10.dp)
            .padding(top = padding.dp)
            .fillMaxWidth(),

        backgroundColor = colorResource(R.color.purple_700),
        text = {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = text,
                    fontSize = 15.sp,
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
fun ButtonExtendableAnswer(
    text: String,
    answerText: Map<String, ExtImage?>,
    padding: Int = 10,
) {
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
            answerText.forEach { entry ->
                if (entry.value != null) {
                    TextWithImage(
                        answerText = entry.key,
                        padding = padding,
                        image = entry.value!!.path,
                        height = entry.value!!.height,
                    )
                } else {
                    Text(
                        text = entry.key,
                        fontSize = 12.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(padding.dp)
                    )
                }
            }
        }
    }
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

class ExtImage(val height: Int, val path: Int)

@Composable
private fun TextWithImage(answerText: String, padding: Int, image: Int, height: Int) {
    Text(
        text = answerText,
        fontSize = 12.sp,
        color = Color.Black,
        modifier = Modifier.padding(padding.dp)
    )

    Image(
        bitmap = ImageBitmap.imageResource(image),
        modifier = Modifier
            .fillMaxWidth()
            .height(height.dp)
            .padding(top = 50.dp),
        contentDescription = "image for $answerText",
    )
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
