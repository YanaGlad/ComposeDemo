package com.example.composedemo.screens.compose.algebra

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedemo.R

/*
 * @author Yana Glad
 */
@Composable
fun RingModulesDescriptionScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {

        Text(
            modifier = Modifier.offset(y = 30.dp).fillMaxWidth(),
            text = "Тело, поле, идеал",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Ассоциативное кольцо с единицей, в котором каждый ненулевой элемент обратим, называется телом. \n",
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = "Коммутативное тело называется полем.\n",
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = "Идеал (двухсторонний) I кольца R – это подгруппа в (абелевой группе) R, инвариантная относительно умножения слева и справа на элементы кольца.\n",
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Text(
            text = "Пояснение 2: Идеал - это такое кольцо, что :",
            modifier = Modifier
                .offset(y = 35.dp, x = 8.dp)
                .padding(end = 8.dp)
        )

        Image(
            bitmap = ImageBitmap.imageResource(R.drawable.ideal),
            contentDescription = "Определение идеала",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .offset(y = 25.dp)
                .padding(top = 28.dp),
            contentScale = ContentScale.Crop
        )
    }
}
