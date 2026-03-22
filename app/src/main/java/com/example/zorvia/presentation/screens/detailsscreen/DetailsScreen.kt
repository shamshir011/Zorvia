package com.example.zorvia.presentation.screens.detailsscreen


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.zorvia.R
import com.example.zorvia.model.Product


@Composable
fun DetailsScreen() {

    val products = listOf(
        Product(id = 1, "Espresso", "Strong and Rich", 3.80, R.drawable.coffee_2),
        Product(id = 2, "Latte", "Smooth and creamy", 4.50, R.drawable.coffee_3),
        Product(id = 3, "Cappuccino", "with chocolate", 4.20, R.drawable.coffee_1),
        Product(id = 4, "Mocha", "With cocoa flavor", 4.70, R.drawable.coffee_4),
        Product(id = 5, "Macchiato", "Bold and milky", 4.60, R.drawable.coffee_5),
        Product(id = 6, "Flat White", "Velvety smooth", 4.40, R.drawable.coffee_6),
        Product(id = 7, "Iced Mocha", "Refreshing and rich ", 4.70,R.drawable.coffee_4
        ),
    )

    val selectedProduct = products.find { it.id == 1 }

    Scaffold(
        topBar = {DetailsScreenTopAppBar()},
        bottomBar = {DetailsScreenBottomBar()}
    ) { innerPadding ->

        LazyColumn {
            item {
//                ProductDetailsContent(
//                    selectedProduct,
//                    innerPadding
//                )
            }
        }
        Box(modifier = Modifier.padding(innerPadding))
    }
}