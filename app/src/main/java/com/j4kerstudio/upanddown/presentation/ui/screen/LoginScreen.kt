package com.j4kerstudio.upanddown.presentation.ui.screen

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.R
import com.j4kerstudio.upanddown.presentation.ui.component.GoogleLoginButton
import com.j4kerstudio.upanddown.presentation.ui.theme.Typography
import com.j4kerstudio.upanddown.until.GoogleSignInHelper

@Composable
fun LoginScreen(navController: NavController, googleSignInHelper: GoogleSignInHelper) {
    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier.weight(1f)
        ) {
            Image(painter = painterResource(id = R.drawable.logo_medium), contentDescription = null)
        }
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Welcome to", style = Typography.displayMedium)
            Text(text = "Up And Down", style = Typography.displayMedium)
        }
        Column (
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            GoogleLoginButton(onClick = { googleSignInHelper.signIn() })
        }
        Spacer(modifier = Modifier.weight(1/2f))
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController(), googleSignInHelper = GoogleSignInHelper(LocalContext.current,Activity()))
}