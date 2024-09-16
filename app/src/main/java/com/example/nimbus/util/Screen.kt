package com.example.nimbus.util

sealed class Screen(val route : String) {
    data object HomeScreen : Screen(Constants.HOME_SCREEN_ROUTE)
}