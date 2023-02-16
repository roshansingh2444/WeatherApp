package com.weatherapp.models

import java.io.Serializable

data class WeatherResponse(
    val coord: Coord,
    val weather: List<Weather>,
    val base: String,
    val main: Main,
    val visibility: Double,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Int,
    val sys: Sys,
    val id: Double,
    val name: String,
    val cod: Double
) : Serializable