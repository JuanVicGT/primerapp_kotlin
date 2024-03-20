package com.example.primeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
   Column (modifier = Modifier
       .fillMaxSize()
       .wrapContentSize(Alignment.Center)
       .padding(horizontal = 5.dp)
   ) {
       Texto(texto = "Bienvenido")
       Space()
       Texto(texto = "A Jetpack")
       Space()
       Texto(texto = "Compose")
       Space()
       Row(modifier = Modifier
           .fillMaxWidth(),
           horizontalArrangement = Arrangement.SpaceEvenly
       ) {
           Circulo(color = Color.Red)
           Circulo(color = Color.Blue)
           Circulo(color = Color.Black)
           Circulo(color = Color.Green)
       }
   }
}

@Composable
fun Texto(texto: String)
{
    Text(
        text = texto,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Black)
            .padding(horizontal = 30.dp)
            .fillMaxWidth()
            .clickable { println("Hola Jetpack") }
    )
}

@Composable
fun Circulo(color: Color) {
    Box(modifier = Modifier
        .size(70.dp)
        .background(color, CircleShape)
    )
}

@Composable
fun Space()
{
    Spacer(modifier = Modifier.height(5.dp))
}