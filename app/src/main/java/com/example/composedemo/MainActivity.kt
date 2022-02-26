package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ComponentExamples.checkLinearLayoutHorizontal
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    initial()
                }
            }
        }
    }
}

@Composable
fun initial() {

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            modifier = Modifier.offset(y = 16.dp),
            text = "Кольца, модули алгебры, категории",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Кольцо R - это абелева группа (Т.е. включает операцию сложения " +
                    "+ и нейтральный элемент 0), в которой так же определен вторая операция - умножение",
            modifier = Modifier
                .offset(y = 16.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = "Кольцо ассоциативно, если операция умножения ассоциативна a(bc) = (ab)c",
            modifier = Modifier
                .offset(y = 16.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.algebra),
            contentDescription = "Красный прямоугольник",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .offset(y = 30.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier.offset(y = 35.dp),
            text = "Далее",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            textAlign = TextAlign.Start
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        initial()
    }
}