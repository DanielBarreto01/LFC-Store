package com.example.composedices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.composedices.ui.composables.MainScreen
import com.example.composedices.ui.composables.ProductListScreen
import com.example.composedices.ui.theme.ComposeDicesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDicesTheme {
                MainScreen()
            }
        }
    }
}