package com.example.novalinea.presentation.screens.project.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.novalinea.common.Constants.BUTTON_BUY_PROJECT
import com.example.novalinea.common.asPrice
import com.example.novalinea.presentation.components.button_action.ButtonActionText
import com.example.novalinea.presentation.ui.theme.OpenSans

@Composable
fun ProjectBottomBar(
	projectPrice: String,
	onClickBuy: () -> Unit
) {
	BottomNavigation(
		backgroundColor = Color.White,
		elevation = 7.dp
	) {
		Row(
			modifier = Modifier
				.padding(top = 5.dp, bottom = 5.dp, start = 15.dp, end = 10.dp)
				.fillMaxWidth(),
			horizontalArrangement = Arrangement.SpaceBetween,
			verticalAlignment = Alignment.CenterVertically
		) {
			Text(
				text = "${projectPrice.toInt().asPrice()} ₽",
				style = TextStyle(
					fontFamily = OpenSans,
					fontWeight = FontWeight.W500,
					fontSize = 20.sp
				)
			)

			ButtonActionText(
				title = BUTTON_BUY_PROJECT,
				enabled = true
			) {
				onClickBuy()
			}
		}
	}
}