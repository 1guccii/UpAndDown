package com.j4kerstudio.upanddown

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.presentation.ui.theme.UpAndDownTheme
import com.j4kerstudio.upanddown.until.GoogleSignInHelper

class MainActivity : ComponentActivity() {
    private lateinit var googleSignInHelper: GoogleSignInHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        googleSignInHelper = GoogleSignInHelper(this, this)
        enableEdgeToEdge()
        setContent {
            UpAndDownTheme {
                UpAndDownApp(googleSignInHelper)
            }
        }
    }
}
