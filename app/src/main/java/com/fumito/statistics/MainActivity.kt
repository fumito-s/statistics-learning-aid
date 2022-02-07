package com.fumito.statistics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fumito.statistics.ui.screen.MainScreen
import com.fumito.statistics.ui.theme.StatisticsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    StatisticsTheme {
        val navController = rememberNavController()
        Scaffold {
            NavHost(navController = navController, startDestination = "main") {
                composable("main") {
                    MainScreen()
                }
            }
        }
    }
}
