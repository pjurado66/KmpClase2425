package com.pjurado.kmpcondesktop.ui.screens


import androidx.compose.foundation.layout.Box
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pjurado.kmpcondesktop.ui.navegacion.bottomBar.BottomBarItem
import com.pjurado.kmpcondesktop.ui.navegacion.bottomBar.bottomBarNavigation


@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    val itemList = listOf(
        BottomBarItem.Episodios(),
        BottomBarItem.Personajes())

    Scaffold(
        bottomBar = {
            MyBottomBar(itemList, navController)
        }
    ) {
        bottomBarNavigation(navController)
    }
}

@Composable
fun MyBottomBar(itemList: List<BottomBarItem>, navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    NavigationBar {
        itemList.forEach { item ->
            NavigationBarItem(
                icon = item.icon,
                selected = currentDestination?.hierarchy?.any{ it.route == item.route } == true,
                onClick = { navController.navigate(item.route) {
                    popUpTo(item.route) { inclusive = true }
                    launchSingleTop = true
                } }
            )
        }
    }
}

