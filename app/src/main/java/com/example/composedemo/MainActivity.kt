package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    checkFrameLayout()
                }
            }
        }
    }
}

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
        Text("Hello  !", style = TextStyle(fontSize = 22.sp))
    }
}

@Composable
fun checkLinearLayout() {
    Column {
        Text("Hello", style = TextStyle(fontSize = 22.sp))
        Text("World", style = TextStyle(fontSize = 22.sp))
        Text("from", style = TextStyle(fontSize = 22.sp))
        Text("Jetpack Compose", style = TextStyle(fontSize = 22.sp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        checkFrameLayout()
    }
}