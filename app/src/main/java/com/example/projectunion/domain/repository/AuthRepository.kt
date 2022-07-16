package com.example.projectunion.domain.repository

import com.example.projectunion.domain.model.Response
import com.example.projectunion.domain.model.UserLogin
import com.example.projectunion.domain.model.UserRegister
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

	fun authorized(): Boolean
	fun verified(): Boolean?
	fun loginByEmail(userData: UserLogin): Flow<Response<Boolean>>
	fun registerByEmail(userData: UserRegister): Flow<Response<Boolean>>
	fun logout(): Flow<Response<Boolean>>
	fun getAuthCurrentUser(): FirebaseUser?
}