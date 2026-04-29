package com.example.mye_comapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mye_comapp.navigation.AppNavGraph
import com.example.mye_comapp.ui.theme.MyEcomAPPTheme
import com.example.mye_comapp.uiscreens.ProfileScreen
import com.example.mye_comapp.viewmodel.CartViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyEcomAPPTheme {
                val cartViewModel : CartViewModel = viewModel()
                AppNavGraph(cartViewModel)

            }
        }
    }
}
