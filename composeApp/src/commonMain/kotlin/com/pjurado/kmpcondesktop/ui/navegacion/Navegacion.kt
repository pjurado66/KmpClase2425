package com.pjurado.kmpcondesktop.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pjurado.kmpcondesktop.ui.screens.HomeScreen


@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = routes.Home) {
        // Aquí se definen las rutas
        composable<routes.Home> {
            HomeScreen()
        }

    }
}





