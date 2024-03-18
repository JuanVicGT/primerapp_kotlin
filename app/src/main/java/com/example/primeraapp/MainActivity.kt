package com.example.primeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
            Texto()
        }
    }
}

/*
* Modificadores cambian carácteristicas
*
* 1. De posicionamiento
* 2. De tamaño = width, height
* 3. De funcionalidad = click, scroll
* 4. De aparencia = background, padding, border
* 5. De escucha = onKeyEvent
*
* */

@Composable
@Preview(showBackground = true)
fun Content() {
    Text(
        text = "Hola jetpack",
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(horizontal = 30.dp)
            .clickable { println("Hola Jetpack") }
    )
}

@Composable
fun Texto()
{
    Text(
        text = "Hola jetpack",
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(horizontal = 30.dp)
            .clickable { println("Hola Jetpack") }
    )
}