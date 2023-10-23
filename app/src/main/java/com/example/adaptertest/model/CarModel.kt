package com.example.adaptertest.model

import java.io.Serializable

data class CarModel(
    val image: String,
    val name: String,
    val year: Int
): Serializable