package com.example.composedemo.screens.compose.algebra.entity

import androidx.compose.ui.graphics.ImageBitmap

/*
 * @author Yana Glad
 */
data class Ticket( //Для решений к билетам
    val bitmap: ImageBitmap,
    val number: Int,
    val tag: String
)