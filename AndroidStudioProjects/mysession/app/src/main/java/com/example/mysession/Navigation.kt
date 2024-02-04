package com.example.session_4

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "SignUpScreen") {
        composable("SignUpScreen") {
            SignUpScreen(navController)
        }
        composable("LoginScreen") {
            LoginScreen(navController)
        }
    }

}
