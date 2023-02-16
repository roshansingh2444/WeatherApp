package com.example.weatherapp.network

import com.example.weatherapp.models.WeatherResponse
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

interface WeatherService {
    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid")appid: String?,
        @Query("units") units: String?
    ) : Call<WeatherResponse>
}