// MainActivity.kt
package com.example.beatonfit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.beatonfit.login.view.LoginScreen
import com.example.beatonfit.login.viewmodel.LoginViewModel
import com.example.beatonfit.ui.theme.BeatOnFitTheme

class MainActivity : ComponentActivity() {
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BeatOnFitTheme {
                LoginScreen(loginViewModel)
            }
        }
    }
}

