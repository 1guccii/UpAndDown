package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.upanddown.R
import com.j4kerstudio.upanddown.presentation.ui.theme.Typography

@Composable
fun GoogleLoginButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonColors(
            containerColor = Color(0xFF1B1A55),
            contentColor = Color(0xFFFFFFFF),
            disabledContentColor = Color(0xFFFFFFFF),
            disabledContainerColor = Color(0xFF1B1A55)),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .width(360.dp)
            .height(80.dp)
        ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.google),
                contentDescription = null,
                tint = Color.Unspecified,)
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Continue with Google", style = Typography.titleLarge)
            Spacer(modifier = Modifier.weight(1f))
        }
    }

}

@Preview
@Composable
fun GoogleLoginButtonPreview() {
    GoogleLoginButton {

    }
}