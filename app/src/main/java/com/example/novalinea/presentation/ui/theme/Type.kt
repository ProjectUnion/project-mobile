package com.example.novalinea.presentation.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.novalinea.R

val OpenSans = FontFamily(
	Font(R.font.opensans_light, FontWeight.W300),
	Font(R.font.opensans_regular, FontWeight.W400),
	Font(R.font.opensans_medium, FontWeight.W500),
	Font(R.font.opensans_bold, FontWeight.W600)
)

val Typography = Typography(
	body1 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W400,
		fontSize = 17.sp
	),
	body2 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W400,
		fontSize = 16.sp
	),
	h6 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W600,
		fontSize = 19.sp
	),
	h5 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W600,
		fontSize = 21.sp
	),
	h4 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W600,
		fontSize = 23.sp
	),
	h3 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W600,
		fontSize = 25.sp
	),
	caption = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W400,
		fontSize = 13.sp,
		color = Color.DarkGray
	),
	subtitle1 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W600,
		fontSize = 17.sp
	),
	subtitle2 = TextStyle(
		fontFamily = OpenSans,
		fontWeight = FontWeight.W500,
		fontSize = 18.sp
	),
    button = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.W600,
        fontSize = 15.sp
    ),
)