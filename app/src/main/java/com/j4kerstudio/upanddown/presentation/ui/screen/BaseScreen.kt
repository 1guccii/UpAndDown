package com.j4kerstudio.upanddown.presentation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BaseScreen() {
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            
        }
        Column(
            modifier = Modifier.weight(8f)
        ) {

        }
        Column(
            modifier = Modifier.weight(1f)
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BaseScreenPreview() {
    BaseScreen()
}
