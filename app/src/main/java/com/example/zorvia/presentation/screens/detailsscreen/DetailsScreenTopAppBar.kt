package com.example.zorvia.presentation.screens.detailsscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zorvia.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun DetailsScreenTopAppBar(){

    TopAppBar(
        title = {
            Text(
                "Details",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
            },

        navigationIcon = {
            Icon(
                painter = painterResource(R.drawable.regular_outline_arrow_left),
                contentDescription = "Back Button",
                modifier = Modifier.padding(start = 8.dp)
            ) },

        actions = {
            Icon(
                painter = painterResource(R.drawable.regular_outline_heart),
                contentDescription = "Add to Favourites",
                modifier = Modifier.padding(end = 8.dp)
            )
        }
    )
}