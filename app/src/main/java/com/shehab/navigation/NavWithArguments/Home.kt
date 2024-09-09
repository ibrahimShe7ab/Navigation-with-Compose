package com.shehab.navigation.NavWithArguments

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController

@Composable
fun HomeScreen( navHostController: NavHostController) {
Column {
    var text by remember { mutableStateOf("") }

        TextField(value = text,onValueChange = {text=it}, placeholder = { Text("enter text") })
    Button(onClick = {navHostController.navigate("DetailsScreen/${text}")}) { }
}
}