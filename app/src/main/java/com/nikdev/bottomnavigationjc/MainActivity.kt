package com.nikdev.bottomnavigationjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nikdev.bottomnavigationjc.ui.theme.BottomNavigationJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationJCTheme {
                MainScreen()
            }
        }
    }
}
