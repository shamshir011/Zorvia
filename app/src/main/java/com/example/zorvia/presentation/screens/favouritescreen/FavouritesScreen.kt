package com.example.zorvia.presentation.screens.favouritescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.zorvia.R
import com.example.zorvia.model.Product
import com.example.zorvia.presentation.ui_components.MyBottomNavBar


@Composable
fun FavouritesScreen(navController: NavController) {

    var favouriteItems by remember {
        mutableStateOf(
            listOf(
                Product(id = 1, "Espresso", "Strong and Rich", 3.80, R.drawable.coffee_2),
                Product(id = 2, "Latte", "Smooth and creamy", 4.50, R.drawable.coffee_3),
                Product(id = 3, "Cappuccino", "with chocolate", 4.20, R.drawable.coffee_1),
            )
        )
    }

    Scaffold(
        topBar = {FavouritesScreenTopBar()},
        bottomBar = { MyBottomNavBar(navController = navController, "Favourites") }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)
        ) {
            item {
                favouriteItems.forEach { product ->
                    FavouritesItemCard(
                        product,
                        onRemove = { favouriteItems = favouriteItems - product}
                    )
                }
            }
        }
    }


}