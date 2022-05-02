package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composedemo.Navigation.ALGEBRA_MENU
import com.example.composedemo.Navigation.ALGEBRA_QUESTION_LIST
import com.example.composedemo.Navigation.ALGEBRA_THEORY
import com.example.composedemo.Navigation.ALGEBRA_TICKETS
import com.example.composedemo.Navigation.AUTOMAT_MENU
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_MENU
import com.example.composedemo.Navigation.COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.Navigation.CONTACT
import com.example.composedemo.Navigation.IMAGE_VIEWER
import com.example.composedemo.Navigation.IN_DEV
import com.example.composedemo.Navigation.RING_DESCRIPTION
import com.example.composedemo.Navigation.RING_DESCRIPTION_QUIZ
import com.example.composedemo.Navigation.RESULT_ONBOARDING
import com.example.composedemo.Navigation.MENU
import com.example.composedemo.Navigation.METHOD_COMPLEX_ANALYSIS_MENU
import com.example.composedemo.Navigation.METHOD_COMPLEX_ANALYSIS_TICKETS
import com.example.composedemo.Navigation.RING_MODULES
import com.example.composedemo.screens.compose.algebra.AlgebraQuestionsList
import com.example.composedemo.screens.compose.algebra.AlgebraTickets
import com.example.composedemo.screens.compose.algebra.RingDescribeScreenFirst
import com.example.composedemo.screens.compose.algebra.RingDescribeScreenQuiz
import com.example.composedemo.screens.compose.algebra.RingModulesDescriptionScreen
import com.example.composedemo.screens.compose.algebra.TheoryScreen
import com.example.composedemo.screens.compose.complexa.ComplexTicketsScreen
import com.example.composedemo.screens.compose.mcomplexa.MComplexTicketsScreen
import com.example.composedemo.screens.compose.menu.AlgebraMenuScreen
import com.example.composedemo.screens.compose.menu.AutomatMenu
import com.example.composedemo.screens.compose.menu.ComplexAScreen
import com.example.composedemo.screens.compose.menu.ContactMenu
import com.example.composedemo.screens.compose.menu.InTheDevelopmentScreen
import com.example.composedemo.screens.compose.menu.MenuScreen
import com.example.composedemo.screens.compose.menu.MethodComplexAScreen
import com.example.composedemo.screens.compose.menu.ResultOnboarding
import com.example.composedemo.screens.utils.ImageViewer
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
                    // Counter()
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
        composable(ALGEBRA_MENU) { AlgebraMenuScreen(navController) }
        composable(MENU) { MenuScreen(navController) }
        composable(RING_DESCRIPTION) { RingDescribeScreenFirst(navController) }
        composable(RING_DESCRIPTION_QUIZ) { RingDescribeScreenQuiz(navController) }
        composable(
            "$RESULT_ONBOARDING/{total}/{correct}/{next}",
            arguments = listOf(
                navArgument("total") { defaultValue = 1 },
                navArgument("correct") { defaultValue = 0 },
                navArgument("next") { defaultValue = RING_MODULES },
            )
        ) {
            ResultOnboarding(
                navController = navController,
                totalAnswerCount = it.arguments?.getInt("total") ?: 0,
                correctAnswerCount = it.arguments?.getInt("correct") ?: 0,
                next = it.arguments?.getString("next") ?: RING_MODULES,
            )
        }
        composable(ALGEBRA_TICKETS) { AlgebraTickets(navController) }
        composable(ALGEBRA_THEORY) { TheoryScreen(navController) }
        composable(IN_DEV) { InTheDevelopmentScreen(navController) }

        composable("$IMAGE_VIEWER/{image}/{destination}",
            arguments = listOf(
                navArgument("image") { defaultValue = R.drawable.algebra },
                navArgument("destination") { defaultValue = MENU },
            )
        ) {
            ImageViewer(navController = navController,
                destination = it.arguments?.getString("destination") ?: MENU,
                image = it.arguments?.getInt("image") ?: R.drawable.algebra)
        }
        composable(RING_MODULES) { RingModulesDescriptionScreen(navController) }
        composable(ALGEBRA_QUESTION_LIST) { AlgebraQuestionsList() }
        composable(COMPLEX_ANALYSIS_MENU) { ComplexAScreen(navController) }
        composable(METHOD_COMPLEX_ANALYSIS_MENU) { MethodComplexAScreen(navController) }
        composable(AUTOMAT_MENU) { AutomatMenu(navController) }
        composable(CONTACT) { ContactMenu(navController) }
        composable(COMPLEX_ANALYSIS_TICKETS) { ComplexTicketsScreen(navController) }
        composable(METHOD_COMPLEX_ANALYSIS_TICKETS) { MComplexTicketsScreen(navController) }
    }
}

object Navigation {
    const val MENU = "menu"
    const val RESULT_ONBOARDING = "result_onboarding"
    const val THIRD_SEM_MENU = "third_sem_menu"
    const val FOUTH_SEM_MENU = "fouth_sem_menu"
    const val AUTHOR = "author"
    const val IN_DEV = "in_dev"
    const val IMAGE_VIEWER = "image_viewer"

    //Алгебра
    const val ALGEBRA_MENU = "algebra_menu"
    const val ALGEBRA_TICKETS = "algebra_tickets"
    const val ALGEBRA_THEORY = "algebra_theory"
    const val ALGEBRA_QUESTION_LIST = "algebra_question_list"

    //Комплексный анализ
    const val COMPLEX_ANALYSIS_MENU = "complex_a_menu"
    const val COMPLEX_ANALYSIS_TICKETS = "complex_a_tickets"

    //Методы комплексного анализа
    const val METHOD_COMPLEX_ANALYSIS_MENU = "method_complex_a_menu"
    const val METHOD_COMPLEX_ANALYSIS_TICKETS = "method_complex_a_tickets"

    //Автоматы
    const val AUTOMAT_MENU = "automat_menu"

    //Связь с автором
    const val CONTACT = "contact"

    //Экраны тестов по алгебре по порядку
    const val RING_DESCRIPTION = "ring_description"
    const val RING_DESCRIPTION_QUIZ = "ring_description_quiz"
    const val RING_MODULES = "ring_module"
    const val RING_MODULES_QUIZ = "ring_module_quiz"

    const val DB_MENU = "db_menu"
    const val DU_MENU = "du_menu"
}
