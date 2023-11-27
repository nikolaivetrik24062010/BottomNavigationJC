package com.nikdev.bottomnavigationjc

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nikdev.bottomnavigationjc.screens.HomeScreen
import com.nikdev.bottomnavigationjc.screens.ProfileScreen
import com.nikdev.bottomnavigationjc.screens.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}