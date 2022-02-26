package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {

                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController, startDestination = "ring_description") {
                        composable("ring_description") { RingDescribeScreenFirst(navController) }
                        composable("ring_description_quiz") { RingDescribeScreenQuiz() }
                    }
                }
            }
        }
    }
}

@Composable
fun RingDescribeScreenFirst(navController: NavController) {

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
            contentDescription = "Примеры колец",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .offset(y = 25.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier.offset(y = 30.dp),
            text = "Коммутативное кольцо",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Если умножение коммутативно ab = ba для любых a,b из кольца, то такое кольцо называют коммутативным",
            modifier = Modifier
                .offset(y = 30.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            modifier = Modifier.offset(y = 30.dp),
            text = "Обратимые элементы",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Если в кольце есть нейтральный элемент по умножению, который" +
                    " называют и обозначают как 1, то такое кольцо называется кольцом с единицей",
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = "К - кольцо с единицей. Элемент а этого кольца называют обратимым, " +
                    "если ab = ba = 1. В этом случае b обратен к а и может обозначаться как a^(-1)",
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Button(
            onClick = { navController.navigate("ring_description_quiz") },
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700) , contentColor = Color.Black)
        ) {
            Text(
                text = "Дальше",
                fontSize = 20.sp,
                color = Color.White
            )
        }
    }
}

@Composable
fun RingDescribeScreenQuiz() {
    Text(text = "Second screen!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ComposeDemoTheme {
        val navController = rememberNavController()
        NavHost(navController, startDestination = "ring_description") {
            composable("ring_description") { RingDescribeScreenFirst(navController) }
            composable("ring_description_quiz") { RingDescribeScreenQuiz() }
        }
    }
}