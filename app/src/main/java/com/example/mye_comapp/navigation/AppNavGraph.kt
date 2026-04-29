package com.example.mye_comapp.navigation

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mye_comapp.uiscreens.CartScreen
import com.example.mye_comapp.uiscreens.HomeScreen
import com.example.mye_comapp.uiscreens.OrderSuccessScreen
import com.example.mye_comapp.uiscreens.PaymentScreen
import com.example.mye_comapp.uiscreens.ProductListScreen
import com.example.mye_comapp.uiscreens.ProfileScreen
import com.example.mye_comapp.uiscreens.SearchScreen
import com.example.mye_comapp.viewmodel.CartViewModel

// Define all the navigation between the screens
@Composable
fun AppNavGraph(
    cartViewModel: CartViewModel
) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) {
        paddingValues ->
        Box(modifier = Modifier.fillMaxSize().padding(paddingValues)) {
            NavHost (
                navController, startDestination = BottomNavItem.Home.route
            ){
                composable("home") {
                    HomeScreen(
                        navController, cartViewModel
                    )
                }
                composable("search") {
                    SearchScreen(cartViewModel)
                }
                composable("cart") {
                    CartScreen(cartViewModel, navController)
                }
                composable("profile") { ProfileScreen() }

                composable("Payment") {
                    PaymentScreen(navController)
                }
                composable("OrderSuccess") {
                    OrderSuccessScreen(navController, cartViewModel)
                }

                composable("products/{category}") {
                    ProductListScreen(it.arguments?.getString("category")!!, cartViewModel)
                }
            }
        }

    }


}

@Composable
fun BottomNavigationBar(navController: NavController)  {

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Cart,
        BottomNavItem.Profile
    )

    NavigationBar (
        modifier = Modifier.background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF42A5F5),
                    Color(0xFF0D47A1)
                )
            )

        ),
        containerColor = Color.Transparent,
        tonalElevation = 6.dp

    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            val selected = currentRoute == item.route

            NavigationBarItem(
                selected = selected,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true

                    }

                },
                icon = {
                    Icon (imageVector = item.icon, contentDescription = item.route, tint = Color.White)
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.White.copy(alpha = 0.18f),

                )


            )

        }


    }

}