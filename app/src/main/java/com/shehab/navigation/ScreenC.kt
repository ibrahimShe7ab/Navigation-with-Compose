package com.shehab.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController

@Composable
fun ScreenC(modifier: Modifier = Modifier,navController: NavController) {
    Row(     modifier = Modifier.clickable { navController.navigate(Content.A)  }.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
     ) {

        Text("SCREEN C", textAlign = TextAlign.Center )


    }
}