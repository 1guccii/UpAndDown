package com.j4kerstudio.upanddown.presentation.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.upanddown.presentation.ui.theme.Typography

@Composable
fun TextFieldScreen() {
    Surface(
        color = Color(0xFFFFF8F8F8)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(1f)
        ) {
            Column(
                modifier = Modifier.weight(9f)
                    .padding(horizontal = 50.dp, vertical = 120.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(text = "Alias name", style = Typography.headlineSmall)


            }
        }
    }
}
@Preview
@Composable
fun TextFieldScreenPreview() {
    TextFieldScreen()
}