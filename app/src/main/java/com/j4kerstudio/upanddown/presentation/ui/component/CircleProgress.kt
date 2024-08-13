package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.upanddown.presentation.ui.theme.Typography

@Composable
fun CircleProgress(progress: Float) {
    Box(
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator(
            color = Color(0xFF9290C3),
            strokeWidth = 16.dp,
            trackColor = Color.White,
            strokeCap = StrokeCap.Round,
            progress = { progress },
            modifier = Modifier.size(100.dp)
        )
        Text(text = "50", style = Typography.headlineSmall.copy(color = Color(0xFF9290C3)))
    }
}
@Preview
@Composable
fun CircleProgressPreview() {
    CircleProgress(progress = 0.5F)
}