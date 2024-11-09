package com.example.composedices.model

import androidx.annotation.DrawableRes
import com.example.composedices.R

data class Product(
    val id: String,
    val name: String,
    val discountPrice: String,
    val originalPrice: String,
    @DrawableRes val image: Int
)

// Lista de productos de muestra
val sampleProductList = listOf(
    Product("1", "Camiseta de primera equipación LFC Nike 24/25 para jóvenes", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("2", "Camiseta de Primera equipación LFC Nike 24/25 para niños", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("3", "Uniforme de primera equipación LFC Nike 24/25 para niños pequeños", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("4", "Shorts de primera equipación LFC Nike Stadium 24/25 para jóvenes", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("5", "Camiseta de primera equipación LFC Nike Stadium 24/25 para jóvenes", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("6", "Shorts de primera equipación LFC Nike Stadium 24/25 para mujeres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("7", "Camiseta de primera equipación LFC Nike Stadium 24/25 para mujeres", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("8", "Shorts de primera equipación LFC Nike Stadium 24/25 para hombres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("9", "Camiseta de primera equipación LFC Nike Stadium 24/25 para hombres", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("10", "Camiseta de primera equipación LFC Nike 24/25 para hombres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("11", "Camiseta de primera equipación LFC Nike 24/25 para hombres", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("12", "Camiseta primera equipación de manga larga LFC Nike Pre-Match 24/25 roja para hombres", "$15.00", "$18.00", R.drawable.fn9154g_1)
    // Agrega más productos según necesites
)