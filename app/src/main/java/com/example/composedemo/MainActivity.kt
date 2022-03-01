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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.Navigation.RING_DESCRIPTION
import com.example.composedemo.Navigation.RING_DESCRIPTION_QUIZ
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
                    stringResource(R.string.abeleva_group),
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
            contentDescription = stringResource(R.string.ring_examples),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .offset(y = 25.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier.offset(y = 30.dp),
            text = stringResource(R.string.commutate_rign),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = stringResource(R.string.commutate_ring_description),
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
            text = stringResource(R.string.netural_element),
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = stringResource(R.string.ring_with_1),
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Button(
            onClick = { navController.navigate(RING_DESCRIPTION_QUIZ) },
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(R.color.teal_700), contentColor = Color.Black)
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
        NavHost(navController, startDestination = RING_DESCRIPTION) {
            composable(RING_DESCRIPTION) { RingDescribeScreenFirst(navController) }
            composable(RING_DESCRIPTION_QUIZ) { RingDescribeScreenQuiz() }
        }
    }
}

object Navigation {
    const val RING_DESCRIPTION = "ring_description"
    const val RING_DESCRIPTION_QUIZ = "ring_description_quiz"
}