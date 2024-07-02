package com.example.primeraapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TitleAppBar(name: String) {
    Text(text = name, fontSize = 25.sp, color = Color.White)
}

@Composable
fun ActionButton() {
    FloatingActionButton(
        containerColor = Color.Red,
        contentColor = Color.White,
        onClick = { /*TODO*/ }
    ) {

        Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar")
    }
}