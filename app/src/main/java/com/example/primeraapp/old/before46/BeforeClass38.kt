package com.example.primeraapp.old.before46

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

val colors = listOf(
    Color.Red,
    Color.Yellow,
    Color.Black,
    Color.Blue,
    Color.Cyan,
    Color.DarkGray,
    Color.Magenta,
    Color.Green
)

val name = "Me Gusta"

@Composable
fun ContentBeforeClass38() {
    var likes by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier
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
        Texto(texto = "Compose x2")
        Space()
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            items(colors) { item ->
                Circulo(color = item)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
        Space()
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = {
                likes++
            }) {
                Text(text = name)
            }
            Spacer(modifier = Modifier.width(10.dp))
            Resultado(likes = likes)
        }
    }
}

@Composable
fun Resultado(likes: Int) {
    Text(text = likes.toString(), fontWeight = FontWeight.Bold, fontSize = 50.sp)
}

@Composable
fun Texto(texto: String) {
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
    Box(
        modifier = Modifier
            .size(70.dp)
            .background(color, CircleShape)
    )
}

@Composable
fun Space() {
    Spacer(modifier = Modifier.height(5.dp))
}