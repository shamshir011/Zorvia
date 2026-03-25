package com.example.zorvia.presentation.ui_components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.zorvia.R
import com.example.zorvia.presentation.navigation.Routes
import com.example.zorvia.presentation.theme.LightBrown

@Composable
fun MyBottomNavBar(navController: NavController, routes: String) {

    val navItems = listOf(
        NavItem("Home", R.drawable.regular_outline_home, Routes.HomeScreen),
        NavItem("Cart", R.drawable.regular_outline_bag, Routes.CartScreen),
        NavItem("Notifications", R.drawable.regular_outline_heart, Routes.ProfileScreen),
        NavItem("Profile", R.drawable.outline_account_circle_24, Routes.FavouritesScreen)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
//        modifier = Modifier.height(100.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
//                Handling bottom bar navigation
                onClick = {
                    navController.navigate(item.routes){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },

                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) },
                modifier = Modifier.size(50.dp),
                selected = item.title == routes,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(alpha = 0.1f)
                )
            )
        }
    }
}


data class NavItem(
    val title: String,
    val icon: Int,
    val routes: Routes
)