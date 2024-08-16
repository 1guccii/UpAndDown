package com.j4kerstudio.upanddown.presentation.ui.screen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.R
import com.j4kerstudio.upanddown.presentation.navigation.Screen
import kotlinx.coroutines.Delay
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = Unit) {
        delay(1000)
        navController.navigate(Screen.LOGIN.name) {
            popUpTo(Screen.SPLASH.name) {
                inclusive = true
            }
        }
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_medium),
            contentDescription = null)
    }
}


@Preview
@Composable
fun SplashScreenPreview() {
    SplashScreen(navController = rememberNavController())
}
