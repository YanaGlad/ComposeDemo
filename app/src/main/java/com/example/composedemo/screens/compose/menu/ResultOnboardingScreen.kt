package com.example.composedemo.screens.compose.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.Navigation
import com.example.composedemo.R
import com.example.composedemo.screens.utils.RoundedImageButton

/*
 * @author Yana Glad
 */
@Composable
fun ResultOnboarding(navController: NavController, totalAnswerCount: Int, correctAnswerCount: Int, next: String) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            imageVector = ImageVector.vectorResource(R.drawable.ic_rocket),
            modifier = Modifier
                .width(400.dp)
                .height(400.dp)
                .padding(top = 50.dp),
            contentDescription = "Finish",
        )

        Text(
            modifier = Modifier.offset(y = 16.dp),
            text = "Тест пройден, правильно $correctAnswerCount/$totalAnswerCount",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )

        Row(modifier = Modifier.padding(top = 50.dp)) {
            RoundedImageButton(icon = R.drawable.ic_space_earth) { navController.navigate(Navigation.MENU) }
            RoundedImageButton(icon = R.drawable.ic_next) { navController.navigate(next) }
        }
    }
}

