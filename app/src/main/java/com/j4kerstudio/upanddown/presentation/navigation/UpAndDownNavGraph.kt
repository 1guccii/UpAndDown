package com.j4kerstudio.upanddown.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.presentation.ui.screen.HomeScreen
import com.j4kerstudio.upanddown.presentation.ui.screen.LoginScreen
import com.j4kerstudio.upanddown.presentation.ui.screen.SplashScreen

enum class Screen {
    HOME,
    SPLASH,
    LOGIN,
}

@Composable
fun UpAndDownNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.SPLASH.name) {
        composable(Screen.LOGIN.name) {
            LoginScreen(navController)
        }
        composable(Screen.SPLASH.name) {
            SplashScreen(navController)
        }
        composable(Screen.HOME.name) {
            HomeScreen(navController)
        }
    }
}