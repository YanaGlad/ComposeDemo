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
import androidx.navigation.navArgument
import com.example.composedemo.Navigation.RING_DESCRIPTION
import com.example.composedemo.Navigation.RING_DESCRIPTION_QUIZ
import com.example.composedemo.Navigation.RESULT_ONBOARDING
import com.example.composedemo.Navigation.MENU
import com.example.composedemo.screens.compose.algebra.RingDescribeScreenFirst
import com.example.composedemo.screens.compose.algebra.RingDescribeScreenQuiz
import com.example.composedemo.screens.compose.menu.MenuScreen
import com.example.composedemo.screens.compose.menu.ResultOnboarding
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
    NavHost(navController, startDestination = MENU) {
        composable(MENU) { MenuScreen (navController) }
        composable(RING_DESCRIPTION) { RingDescribeScreenFirst(navController) }
        composable(RING_DESCRIPTION_QUIZ) { RingDescribeScreenQuiz(navController) }
        composable(
            "$RESULT_ONBOARDING/{total}/{correct}",
            arguments = listOf(
                navArgument("total") { defaultValue = 1 },
                navArgument("correct") { defaultValue = 0 }
            )
        ) {
            ResultOnboarding(
                navController = navController,
                totalAnswerCount = it.arguments?.getInt("total") ?:0,
                correctAnswerCount =  it.arguments?.getInt("correct") ?:0,
            ) }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

//    ComposeDemoTheme {
//     //   Navigation()
//    }
}

object Navigation {
    const val MENU = "menu"
    const val THIRD_SEM_MENU = "fouth_sem_menu"
    const val FOUTH_SEM_MENU = "fouth_sem_menu"
    const val ALGEBRA_MENU = "algebra_menu"
    const val AUTOMAT_MENU = "automat_menu"
    const val METHOD_COMPLEX_MENU = "method_complex_menu"
    const val COMPLEX_MENU = "complex_menu"
    const val DB_MENU = "db_menu"
    const val DU_MENU = "du_menu"
    const val AUTHOR = "author"
    const val RING_DESCRIPTION = "ring_description"
    const val RING_DESCRIPTION_QUIZ = "ring_description_quiz"
    const val RESULT_ONBOARDING = "result_onboarding"
}