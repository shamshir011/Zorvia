package com.example.zorvia.presentation.screens.cartscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.zorvia.R
import com.example.zorvia.model.Product
import com.example.zorvia.presentation.theme.LightBrown

@Preview
@Composable
fun CartScreen() {

    val cartProducts = listOf(
        Product(id = 1, "Espresso", "Strong and Rich", 3.80, R.drawable.coffee_2),
        Product(id = 2, "Latte", "Smooth and creamy", 4.50, R.drawable.coffee_3),
        Product(id = 3, "Cappuccino", "with chocolate", 4.20, R.drawable.coffee_1),
    )

    Scaffold(
        topBar = { CartScreenTopBar() }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .padding(innerPadding)
        ) {

            item {
                Row() {
                    Text(
                        text = "Deliver",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = LightBrown
                        )
                }

                Spacer(modifier = Modifier.height(16.dp))

                cartProducts.forEach { product ->
                    CartItemCard(product)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = "Payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold
                    )
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Price")
                    Text(text = "Amount")
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Price")
                    Text(text = "Amount")
                }
            }
        }

//        Box(modifier = Modifier.padding(innerPadding))
    }
}