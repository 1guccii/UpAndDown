package com.j4kerstudio.upanddown

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.j4kerstudio.upanddown.presentation.ui.component.BottomBar
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
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize(1f)
                ) {
                    BottomBar()
                }
            }
        }
    }
}
