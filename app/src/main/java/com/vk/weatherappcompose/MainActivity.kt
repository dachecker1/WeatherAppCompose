package com.vk.weatherappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.vk.weatherappcompose.screen.MainCard
import com.vk.weatherappcompose.screen.TabLayout
import com.vk.weatherappcompose.ui.theme.WeatherAppComposeTheme

const val API_KEY = "9699d1540c684dcfb18123500221108"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppComposeTheme {
                Image(
                    painter = painterResource(id = R.drawable.wallpaper),
                    contentDescription = "wallpaper",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.5F),
                    contentScale = ContentScale.FillBounds
                )
                Column {
                    MainCard()
                    TabLayout()
                }

            }
        }
    }
}

