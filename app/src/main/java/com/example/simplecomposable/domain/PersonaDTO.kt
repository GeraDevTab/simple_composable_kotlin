package com.example.simplecomposable.domain

import com.google.gson.annotations.SerializedName
import java.io.Serial

data class PersonaDTO(
    @SerializedName("nombre") val nombre: String,
    @SerializedName("apellido") val apellido: String,
    @SerializedName("edad") val edad: Int,
    @SerializedName("url") val url: String
)
