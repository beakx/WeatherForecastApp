package com.example.weatherforecastapp.data.remote.dto.forecast


import com.google.gson.annotations.SerializedName

data class Rain(
    @SerializedName("3h")
    val h: Double
)
