package com.j4kerstudio.upanddown

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.presentation.navigation.UpAndDownNavHost
import com.j4kerstudio.upanddown.until.GoogleSignInHelper

@Composable
fun UpAndDownApp(googleSignInHelper: GoogleSignInHelper) {
    val navHostController = rememberNavController()
    UpAndDownNavHost(navHostController,googleSignInHelper)
}