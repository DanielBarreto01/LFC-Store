package com.example.composedices.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.composedices.R
import com.example.composedices.ui.theme.BackgroundColor
import com.example.composedices.ui.theme.ColorTitle

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen(navController: NavController, productId: String?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TopAppBar(
            title = {
                Row {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            Icons.Default.ArrowBack,
                            contentDescription = "Retroceder",
                            tint = ColorTitle
                        )
                    }
                    Text("Home Kit", modifier = Modifier.padding(top = 8.dp, start = 0.dp))
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = BackgroundColor,
                titleContentColor = ColorTitle,
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Imagen del producto
        Image(
            painter = painterResource(id = R.drawable.fn9154g_1), // Usa tu recurso de imagen aquí
            contentDescription = "Producto $productId",
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )

        Spacer(modifier = Modifier.height(16.dp))


// Carrusel de imágenes
        val imageList = listOf(
            R.drawable.fn9154g_1, // Reemplaza con tus recursos de imagen
            R.drawable.fn9066g_1,
            R.drawable.fn9066g_1
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            items(imageList) { imageRes ->
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = "Imagen del producto",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(8.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Título del producto
        Text(
            text = "LFC Nike Youth 24/25 Home Stadium Shorts",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Descuento
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "25% OFF",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "$30.00",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "$40.00",
                color = Color.Gray,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                style = LocalTextStyle.current.copy(textDecoration = TextDecoration.LineThrough)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Selección de Tallas
        Text(text = "Size", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val sizes = listOf("S", "M", "L", "XL")
            sizes.forEach { size ->
                OutlinedButton(onClick = { /* Acción al seleccionar la talla */ }) {
                    Text(text = size)
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botones para guía de talla
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ClickableText(
                text = AnnotatedString("Find your size"),
                onClick = { /* Acción para guía de talla */ },
                style = LocalTextStyle.current.copy(color = Color.Blue)
            )

            ClickableText(
                text = AnnotatedString("Size guide"),
                onClick = { /* Acción para guía de tamaño */ },
                style = LocalTextStyle.current.copy(color = Color.Blue)
            )
        }
    }
}