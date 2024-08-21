package com.j4kerstudio.upanddown.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.android.gms.auth.api.Auth
import com.google.firebase.auth.FirebaseAuth
import com.j4kerstudio.upanddown.presentation.ui.screen.HomeScreen
import com.j4kerstudio.upanddown.presentation.ui.screen.LoginScreen
import com.j4kerstudio.upanddown.presentation.ui.screen.SplashScreen
import com.j4kerstudio.upanddown.until.GoogleSignInHelper

enum class Screen {
    HOME,
    SPLASH,
    LOGIN,
}

@Composable
fun UpAndDownNavHost(navController: NavHostController, googleSignInHelper: GoogleSignInHelper) {
    NavHost(navController = navController, startDestination = Screen.SPLASH.name) {
        composable(Screen.LOGIN.name) {
            LoginScreen(navController = navController, googleSignInHelper = googleSignInHelper)
        }
        composable(Screen.HOME.name) {
            HomeScreen(navController)
        }
    }
}