package com.pjurado.kmpcondesktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KmpClase2425",
    ) {
        App()
    }
}