package com.shehab.navigation.NavWithArguments

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun MainScreenNav() {
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = "HomeScreen"){
        composable(route="HomeScreen"){ HomeScreen(navController) }

        composable(route= "DetailsScreen/{text}", arguments = listOf(navArgument(name = "text"){ type=
            NavType.StringType
        })){
            backStack ->
            backStack.arguments?.getString("text")
        }}}