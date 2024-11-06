package com.example.composedices.ui.composables

import ProductItem
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.composedices.model.sampleProductList
import com.example.composedices.ui.theme.BackgroundColor
import com.example.composedices.ui.theme.ColorTitle

@OptIn(androidx.compose.material3.ExperimentalMaterial3Api::class)
@Composable
fun ProductListScreen() {
    Column {
        // Barra de título con "Home Kit"
        TopAppBar(
            title = {
                Row {
                    IconButton(onClick = { /* TODO: Acción de retroceso */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Retroceder", tint = ColorTitle)
                    }
                    Text("Home Kit", modifier = Modifier.padding(top = 8.dp, start = 0.dp))
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(Icons.Default.Home, contentDescription = "Home", tint = ColorTitle)
                }
                IconButton(onClick = { /* TODO: Acción de búsqueda */ }) {
                    Icon(Icons.Default.Search, contentDescription = "Buscar", tint = ColorTitle)
                }
                IconButton(onClick = { /* TODO: Acción de carrito */ }) {
                    Icon(Icons.Default.ShoppingCart, contentDescription = "Carrito", tint = ColorTitle)
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = BackgroundColor,
                titleContentColor = ColorTitle,
            )
        )

        // Filtros
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(onClick = { /* TODO: Acción ordenar */ }) {
                Text("POSITION")
            }
            TextButton(onClick = { /* TODO: Acción filtrar */ }) {
                Text("FILTER")
            }
        }
        // Texto centrado en otra fila
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "16 items found")
        }

        // Lista de productos en LazyVerticalGrid
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 2.dp, top = 2.dp, end = 2.dp, bottom = 18.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(sampleProductList) { product ->
                ProductItem(product)
            }
        }
    }
}