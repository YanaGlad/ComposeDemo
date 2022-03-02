package com.example.composedemo

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
 * @author Yana Glad
 */
object ComponentExamples {
    @Composable
    fun Greeting(name: String) {
        Text(
            "Hello $name",
            fontSize = 22.sp,
            modifier = Modifier
                .background(Color.Yellow)
                .padding(10.dp)
                .height(170.dp)
                .widthIn()
                .fillMaxSize()
                .offset(x = 30.dp, y = 50.dp)
                .verticalScroll(ScrollState(0))
                .horizontalScroll(ScrollState(0))
        )
    }

    @Composable
    fun ClickCounter() {
        val count = remember { mutableStateOf(0) }

        Text("Clicks: ${count.value}",
            fontSize = 28.sp,
            modifier = Modifier
                .clickable(onClick = { count.value += 1 })
                .fillMaxHeight()
                .fillMaxWidth()
        )
    }

    @Composable
    fun checkFrameLayout() {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Box(modifier = Modifier
                .background(Color.Blue)
                .size(300.dp))
            Box(modifier = Modifier
                .background(Color.LightGray)
                .size(200.dp))
            Box(modifier = Modifier
                .background(Color.Cyan)
                .size(100.dp))
            Text("Hello!", style = TextStyle(fontSize = 22.sp))
        }
    }

    @Composable
    fun checkLinearLayoutVertical() {
        Column {
            Text("Hello", style = TextStyle(fontSize = 22.sp))
            Text("World", style = TextStyle(fontSize = 22.sp))
            Text("from", style = TextStyle(fontSize = 22.sp))
            Text("Jetpack Compose", style = TextStyle(fontSize = 22.sp))
        }
    }

    @Composable
    fun checkLinearLayoutHorizontal() {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(modifier = Modifier
                .background(Color.Red)
                .height(150.dp)
                .width(100.dp))
            Box(modifier = Modifier
                .background(Color.Yellow)
                .height(150.dp)
                .width(100.dp))
            Box(modifier = Modifier
                .background(Color.Green)
                .height(150.dp)
                .width(100.dp))
        }
    }
}