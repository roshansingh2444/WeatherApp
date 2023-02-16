package com.weatherapp.models

import java.io.Serializable

data class Weather(
    val id: Double,
    val main: String,
    val description: String,
    val icon: String
) : Serializable