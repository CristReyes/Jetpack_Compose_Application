package com.foro1.jetpackcomposeapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.foro1.jetpackcomposeapplication.screens.LoginScreen
import com.foro1.jetpackcomposeapplication.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController)
        }
        composable("welcome/{username}") { backStackEntry ->
            val username = backStackEntry.arguments?.getString("username") ?: ""
            WelcomeScreen(username = username, navController = navController)
        }
    }
}
