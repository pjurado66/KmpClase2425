package com.pjurado.kmpcondesktop.ui.navegacion.bottomBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pjurado.kmpcondesktop.ui.navegacion.routes
import com.pjurado.kmpcondesktop.ui.screens.EpisodiosScreen
import com.pjurado.kmpcondesktop.ui.screens.PersonajesScreen

@Composable
fun bottomBarNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = routes.Episodios) {
        composable<routes.Episodios> {
            EpisodiosScreen()
        }
        composable<routes.Personajes> {
            PersonajesScreen()
        }
    }
}