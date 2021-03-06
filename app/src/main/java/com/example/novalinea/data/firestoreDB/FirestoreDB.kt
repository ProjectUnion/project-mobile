package com.example.novalinea.data.firestoreDB

import com.example.novalinea.domain.model.*
import kotlinx.coroutines.flow.Flow

interface FirestoreDB{

	// User
	fun createUser(userData: UserRegister, uid: String): Flow<Response<Boolean>>
	fun getUserById(id: String): Flow<Response<UserProfile?>>
	fun uploadPhotoUser(photo: String, id: String): Flow<Response<String>>
	fun editProfile(user: UserEdit): Flow<Response<Boolean>>

	// Project
	fun createProject(projectData: ProjectCreate): Flow<Response<String>>
	fun uploadUrlImagesProject(images: MutableList<String>, id: String): Flow<Response<Boolean>>
	fun getProjectById(id: String): Flow<Response<ProjectOpen?>>
	fun getProjects(): Flow<Response<List<ProjectTape>>>
	fun getProjectsUser(id: String): Flow<Response<List<ProjectTape>>>
	fun incrementView(id: String): Flow<Response<Boolean>>
}