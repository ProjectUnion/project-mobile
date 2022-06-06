package com.example.projectunion.model

import java.sql.Date
import java.sql.Time

data class Project (
	val id: Int,
	val title: String,
	val description: String,
	//val type: String,
	val price: Int,
	//val paymentSystem: String,
	//val listStaff: List<String>,
	val createdAt: String,
	//val updatedAt: Time,
	//val likes: Int,
	//val views: Int,
	//val creatorID: Int,
	val creatorName: String,
	//val creatorPhoto: String
)