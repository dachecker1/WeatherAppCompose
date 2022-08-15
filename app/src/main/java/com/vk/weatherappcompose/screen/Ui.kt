package com.vk.weatherappcompose.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.vk.weatherappcompose.data.WeatherModel
import com.vk.weatherappcompose.ui.theme.LightBlue

@Composable
fun ListItem(item: WeatherModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 3.dp),
        backgroundColor = LightBlue,
        elevation = 0.dp,
        shape = RoundedCornerShape(5.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.padding(start = 5.dp, top = 2.dp, bottom = 2.dp)) {
                Text(text = item.time,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp
                    )
                )
                Text(text = item.condition,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 18.sp
                    )
                )
            }
            Text(
                text = item.currentTemp.ifEmpty {
                    "${item.maxTemp}/${item.minTemp}"
                },
                style = TextStyle(color = Color.White, fontSize = 32.sp)
            )
            AsyncImage(
                model = "https:${item.icon}",
                contentDescription = "image",
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(35.dp)
            )
        }
    }
}