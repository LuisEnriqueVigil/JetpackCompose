package com.example.courseapplication.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonForDarkMode(darkModeFun : MutableState<Boolean>){
    Button(
        onClick = {
            darkModeFun.value = !darkModeFun.value
        },
    ) {
        Icon(imageVector = Icons.Default.Star, contentDescription = "Dark Mode" )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = "Dark Mode")
    }
}
