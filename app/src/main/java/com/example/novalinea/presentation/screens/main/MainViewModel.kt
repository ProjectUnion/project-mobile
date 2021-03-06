package com.example.novalinea.presentation.screens.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.novalinea.common.Constants.USER
import com.example.novalinea.domain.model.Response
import com.example.novalinea.domain.model.UserProfile
import com.example.novalinea.domain.use_case.CheckAuthorizedUseCase
import com.example.novalinea.domain.use_case.GetAuthCurrentUserUseCase
import com.example.novalinea.domain.use_case.GetUserByIdUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
	private val checkAuthorizedUseCase: CheckAuthorizedUseCase,
	private val getAuthCurrentUserUseCase: GetAuthCurrentUserUseCase,
	private val getUserByIdUseCase: GetUserByIdUseCase
): ViewModel() {

	val isAuth get() = checkAuthorizedUseCase()

	init {
	    getDataUser()
	}

	private fun getDataUser() {
		if (isAuth) {
			viewModelScope.launch {
				val id = getAuthCurrentUserUseCase()?.uid.toString()

				getUserByIdUseCase(id).collect { response ->
					if (response is Response.Success) {
						response.data?.let { user ->
							USER = user
						}
					}
				}
			}
		}
		else
			USER = UserProfile()
	}
}