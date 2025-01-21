package com.pjurado.kmpcondesktop.ui.navegacion

import kotlinx.serialization.Serializable


sealed class routes {
    @Serializable
    object Home : routes()

}