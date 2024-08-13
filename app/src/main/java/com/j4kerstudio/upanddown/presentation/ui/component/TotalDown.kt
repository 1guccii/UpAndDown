package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
fun TotalDown() {
        Column(
            modifier = Modifier
                .width(144.dp)
                .height(80.dp)
                .background(color = Color(0xFF070F2B), shape = RoundedCornerShape(size = 10.dp))
        ) {
            Column(
                modifier = Modifier.padding(top = 16.dp, start = 14.dp)
            ) {
                Text(text = "Download (MB)", style = Typography.labelMedium)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "100", style = Typography.headlineSmall)
                Spacer(modifier = Modifier.weight(2f))
            }
        }
}
@Preview(showBackground = true)
@Composable
fun TotalDownPreview() {
    TotalDown()
}