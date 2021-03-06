package com.example.novalinea.common

fun Int.asMonth(): String {
	return when(this) {
		1 -> "янв"
		2 -> "фев"
		3 -> "мар"
		4 -> "апр"
		5 -> "май"
		6 -> "июн"
		7 -> "июл"
		8 -> "авг"
		9 -> "сен"
		10 -> "окт"
		11 -> "ноя"
		12 -> "дек"
		else -> ""
	}
}