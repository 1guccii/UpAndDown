package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.upanddown.R
import com.j4kerstudio.upanddown.presentation.ui.theme.PrimeColor

@Composable
fun BottomBar() {
    var selectedIndex by remember { mutableStateOf(-1) }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceAround,
        modifier = Modifier.fillMaxWidth(1f).height(70.dp)
    ) {
        IconButton(
            onClick = { selectedIndex = 0 }
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.home),
                contentDescription = "home",
                tint = if (selectedIndex == 0) Color.Blue else Color.Gray
                )
        }
        IconButton(
            onClick = { selectedIndex = 1 }
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.course),
                contentDescription = "course",
                tint = if (selectedIndex == 1) Color.Blue else Color.Gray
                )
        }
        IconButton(
            onClick = { selectedIndex = 2 }
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.folder_library),
                contentDescription = "library",
                tint = if (selectedIndex == 2) Color.Blue else Color.Gray
            )
        }
        IconButton(
            onClick = { selectedIndex = 3 }
        ) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.user),
                contentDescription = "user",
                tint = if (selectedIndex == 3) Color.Blue else Color.Gray
                )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar()
}