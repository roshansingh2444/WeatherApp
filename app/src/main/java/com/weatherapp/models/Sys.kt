package com.weatherapp.models

import java.io.Serializable

data class Sys(
    val type: Double,
    val message: Double,
    val country: String,
    val sunrise: Double,
    val sunset: Double
) : Serializable