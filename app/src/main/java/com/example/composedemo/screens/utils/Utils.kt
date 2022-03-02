package com.example.composedemo.screens.utils

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CheckBoxWithText(text: String) {
    val checkedState = remember { mutableStateOf(true) }

    Row {
        Checkbox(
            modifier = Modifier
                .offset(x = 16.dp)
                .padding(top = 8.dp),
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
        Text(
            text = text,
            fontSize = 22.sp,
            modifier = Modifier
                .offset(x = 18.dp)
                .padding(top = 2.dp)
        )
    }
}