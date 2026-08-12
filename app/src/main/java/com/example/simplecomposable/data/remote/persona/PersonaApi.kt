package com.example.simplecomposable.data.remote.persona

import com.example.simplecomposable.domain.PersonaDTO
import retrofit2.http.GET

interface PersonaApi {
    @GET("/personal")
    suspend fun getPersonas(): List<PersonaDTO>
}