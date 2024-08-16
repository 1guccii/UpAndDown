package com.j4kerstudio.upanddown

import UpAndDownApp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.j4kerstudio.upanddown.presentation.ui.theme.UpAndDownTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UpAndDownTheme {
                UpAndDownApp()
            }
        }
    }
}
