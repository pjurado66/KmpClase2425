package com.pjurado.kmpcondesktop.ui.navegacion.bottomBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.pjurado.kmpcondesktop.ui.navegacion.routes

sealed class BottomBarItem {
    abstract val route: Any
    abstract val title: String
    abstract val icon: @Composable () -> Unit

    data class Episodios(
        override val route: Any = routes.Episodios,
        override val title: String = "Episodios",
        override val icon: @Composable () -> Unit = {
            Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Home")
        }
    ) : BottomBarItem()

    data class Personajes(
        override val route: Any = routes.Personajes,
        override val title: String = "Personajes",
        override val icon: @Composable () -> Unit = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Personajes")
        }
    ): BottomBarItem()
}