package com.j4kerstudio.upanddown.presentation.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.j4kerstudio.upanddown.R
import com.j4kerstudio.upanddown.presentation.ui.theme.Typography

@Composable
fun TextFieldScreen() {
    Column(
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Column {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.logo_medium),
                contentDescription = null,
                modifier = Modifier.fillMaxHeight(1f)
            )
            Text(text = "Alias Name", style = Typography.titleLarge)
            BasicTextField(value = "", onValueChange = {})
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TextFieldScreenPreview() {
    TextFieldScreen()
}
