package com.example.nimbus.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nimbus.homeScreen.HomeScreen
import com.example.nimbus.util.Constants
import com.example.nimbus.util.Screen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route)
    {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen()
        }
    }
}