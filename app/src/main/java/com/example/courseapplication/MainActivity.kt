package com.example.courseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courseapplication.ui.theme.CourseApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val darkMode = remember{ mutableStateOf(false) }
            CourseApplicationTheme(
                darkTheme = darkMode.value
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color=MaterialTheme.colorScheme.background
                ) {
                  Content(
                      darkMode = darkMode
                  )
                }
            }
        }
    }
}

@Composable
fun Content(darkMode: MutableState<Boolean>){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    ButtonForDarkMode(
        darkModeFun = darkMode
    )
    }
}

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


