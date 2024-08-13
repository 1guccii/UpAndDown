package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.upanddown.presentation.ui.theme.Typography

@Composable
fun BoxProgress() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .width(120.dp)
            .height(190.dp)
            .background(
                Color(0xFF070F2B),
                shape = RoundedCornerShape(10.dp)
            )
    ) {
        CircleProgress(progress = 0.5F)
        Spacer(modifier = Modifier.height(28.dp))
        Text(text = "10/20 MB", style = Typography.bodySmall.copy(Color(0xFF9290C3)))
    }
}
@Preview
@Composable
fun BoxProgressPreview() {
    BoxProgress()
}