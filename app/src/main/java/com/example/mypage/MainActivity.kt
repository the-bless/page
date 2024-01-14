package com.example.mypage

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import android.os.Bundle
import com.example.mypage.login.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

