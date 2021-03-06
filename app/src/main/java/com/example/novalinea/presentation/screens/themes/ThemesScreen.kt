package com.example.novalinea.presentation.screens.themes

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.novalinea.presentation.screens.themes.components.ThemesTopBar

@Composable
fun ThemesScreen(
	navController: NavController
) {
	Scaffold(
		topBar = {
			ThemesTopBar() {
				navController.popBackStack()
			}
		},
	) {

	}
}