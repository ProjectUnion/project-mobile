package com.example.novalinea.presentation.screens.about_app

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.novalinea.presentation.screens.about_app.components.AboutTopBar

@Composable
fun AboutAppScreen(
	navController: NavController
) {
	Scaffold(
		topBar = {
			AboutTopBar() {
				navController.popBackStack()
			}
	 },
	) {
		Column(
			modifier = Modifier
				.fillMaxSize()
				.verticalScroll(rememberScrollState())
		) {
//			Card(
//				modifier = Modifier
//					.size(70.dp),
//				elevation = 0.dp,
//				shape = CircleShape
//			) {
//				Icon(
//					painter = painterResource(id = R.drawable.ic_logo),
//					contentDescription = null
//				)
//			}
		}
	}
}