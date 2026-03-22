package com.example.zorvia.presentation.ui_components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.zorvia.R
import com.example.zorvia.presentation.theme.LightBrown


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBottomNavBar() {

    val navItems = listOf(
        NavItem("Home", R.drawable.regular_outline_home),
        NavItem("Search", R.drawable.regular_outline_bag),
        NavItem("Notifications", R.drawable.regular_outline_heart),
        NavItem("Profile", R.drawable.outline_account_circle_24)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
//        modifier = Modifier.height(100.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                    )
                },
                label = { Text(text = item.title) },
                modifier = Modifier.size(50.dp),
                onClick = {},
                selected = true,
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
//    val routes: NavBarRoutes
)