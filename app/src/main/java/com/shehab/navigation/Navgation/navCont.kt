package com.shehab.navigation.Navgation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shehab.navigation.Content
import com.shehab.navigation.ScreenA
import com.shehab.navigation.ScreenB
import com.shehab.navigation.ScreenC

@Composable
fun Nav(modifier: Modifier = Modifier) {
    val navController= rememberNavController()
    NavHost(navController=navController, startDestination = "ScreenA"){
        composable(route=Content.A){
            ScreenA(modifier = Modifier, navController = navController)
        }
        composable(route=Content.B){
            ScreenB(modifier = Modifier,navController)
        }
        composable(route=Content.C){
            ScreenC(modifier = Modifier,navController)
        }

    }


}

