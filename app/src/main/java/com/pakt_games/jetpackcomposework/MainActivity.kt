package com.pakt_games.jetpackcomposework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pakt_games.jetpackcomposework.ui.theme.JetPackComposeWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeWorkTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "Merhaba")
       Box(modifier = Modifier
           .size(86.dp)
           .background(Color.Red))
       Box(modifier = Modifier
           .size(55.dp)
           .background(Color.Blue))
       Box(modifier = Modifier
           .size(15.dp)
           .background(Color.Magenta))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetPackComposeWorkTheme {
        Sayfa()
    }
}