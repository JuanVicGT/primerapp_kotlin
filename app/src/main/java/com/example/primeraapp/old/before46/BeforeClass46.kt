package com.example.primeraapp.old.before46

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.primeraapp.old.before46.components.BotonFlotante
import com.example.primeraapp.old.before46.components.BotonIcono
import com.example.primeraapp.old.before46.components.BotonSwitch
import com.example.primeraapp.old.before46.components.DarkMode
import com.example.primeraapp.old.before46.components.NormalButton
import com.example.primeraapp.old.before46.components.NormalButton2
import com.example.primeraapp.old.before46.components.NormalButton3
import com.example.primeraapp.old.before46.components.NormalButton4


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


/**
 * La manera de usar el dark mode (va en MainActivity):
 *
 *  override fun onCreate(savedInstanceState: Bundle?) {
 *         super.onCreate(savedInstanceState)
 *         setContent {
 *             val darkMode = remember { mutableStateOf(false) }
 *
 *             PrimeraAppTheme(darkTheme = darkMode.value) {
 *                 Surface (
 *                     modifier = Modifier.fillMaxSize(),
 *                     color = MaterialTheme.colorScheme.background
 *                 ) {
 *                     // ContentBeforeClass38()
 *                     ContentAfterClass38(darkMode = darkMode)
 *                 }
 *             }
 *         }
 *     }
 */
@Composable
fun ContentAfterClass38(darkMode: MutableState<Boolean>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        NormalButton()
        Space()
        NormalButton2()
        Space()
        NormalButton3()
        Space()
        NormalButton4()
        Space()
        BotonIcono()
        Space()
        BotonSwitch()
        Space()
        DarkMode(darkMode = darkMode)
        Space()
        BotonFlotante()
    }
}