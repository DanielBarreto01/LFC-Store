package com.example.composedices.model

import androidx.annotation.DrawableRes
import com.example.composedices.R

data class Product(
    val name: String,
    val discountPrice: String,
    val originalPrice: String,
    @DrawableRes val image: Int
)

// Lista de productos de muestra
val sampleProductList = listOf(
    Product("Camiseta de primera equipación LFC Nike 24/25 para jóvenes", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("Camiseta de Primera equipación LFC Nike 24/25 para niños", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("Uniforme de primera equipación LFC Nike 24/25 para niños pequeños", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("Shorts de primera equipación LFC Nike Stadium 24/25 para jóvenes", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("Camiseta de primera equipación LFC Nike Stadium 24/25 para jóvenes", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("Shorts de primera equipación LFC Nike Stadium 24/25 para mujeres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("Camiseta de primera equipación LFC Nike Stadium 24/25 para mujeres", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("Shorts de primera equipación LFC Nike Stadium 24/25 para hombres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("Camiseta de primera equipación LFC Nike Stadium 24/25 para hombres", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("Camiseta de primera equipación LFC Nike 24/25 para hombres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    Product("LFC Nike 24/25 Home Socks", "$20.00", "$25.00", R.drawable.fn9154g_1),
    Product("Camiseta primera equipación de manga larga LFC Nike Pre-Match 24/25 roja para hombres", "$15.00", "$18.00", R.drawable.fn9154g_1),
    // Agrega más productos según necesites
)