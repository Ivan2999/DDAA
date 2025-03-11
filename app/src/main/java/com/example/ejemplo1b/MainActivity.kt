package com.example.ejemplo1b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemplo1b.ui.theme.Ejemplo1BTheme
import navigation.NavManager
import views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingPreview()
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
       NavManager()

    }