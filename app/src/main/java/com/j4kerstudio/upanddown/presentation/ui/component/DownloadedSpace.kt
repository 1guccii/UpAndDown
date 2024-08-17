package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun DownloadSpace(process: Float) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .width(300.dp)
            .height(100.dp)
            .background(Color.White)
    ) {
        Box(
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator(
                color = Color(0xFF1B1A55),
                strokeCap = StrokeCap.Round,
                strokeWidth = 8.dp,
                trackColor = Color(0xFF9290C3),
                progress = { process },
                modifier = Modifier.size(60.dp)
            )
            Text(text = "70%", style = Typography.titleSmall)
        }
        Column {
            Text(text = "Download Space", style = Typography.titleSmall.copy(Color.Black))
            Text(text = "14MB out of 20MB used", style = Typography.bodySmall)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DownloadSpacePreview() {
    DownloadSpace(process = 0.4F)
}