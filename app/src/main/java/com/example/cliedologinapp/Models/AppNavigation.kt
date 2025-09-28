package com.example.cliedologinapp.Models

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cliedologinapp.Screens.Login
import com.example.cliedologinapp.Screens.Register


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            Login(innerPadding = PaddingValues(0.dp), navController)
        }
        composable("register") {
            Register(innerPadding = PaddingValues(0.dp), navController)
        }
    }
}
