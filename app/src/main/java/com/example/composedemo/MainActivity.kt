package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composedemo.Navigation.RING_DESCRIPTION
import com.example.composedemo.Navigation.RING_DESCRIPTION_QUIZ
import com.example.composedemo.screens.algebra.RingDescribeScreenFirst
import com.example.composedemo.screens.algebra.RingDescribeScreenQuiz
import com.example.composedemo.ui.theme.ComposeDemoTheme

/*
 * @author Yana Glad
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {

                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "ring_description") {
        composable("ring_description") { RingDescribeScreenFirst(navController) }
        composable("ring_description_quiz") { RingDescribeScreenQuiz() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ComposeDemoTheme {
        Navigation()
    }
}

object Navigation {
    const val RING_DESCRIPTION = "ring_description"
    const val RING_DESCRIPTION_QUIZ = "ring_description_quiz"
}