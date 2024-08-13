package com.j4kerstudio.upanddown.presentation.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.j4kerstudio.upanddown.R

@Composable
fun BottomBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Absolute.SpaceAround,
        modifier = Modifier.fillMaxWidth(1f).height(70.dp)
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.home), contentDescription = "home")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.course), contentDescription = "course")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.folder_library), contentDescription = "library")
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.user), contentDescription = "user")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BottomBarPreview() {
    BottomBar()
}