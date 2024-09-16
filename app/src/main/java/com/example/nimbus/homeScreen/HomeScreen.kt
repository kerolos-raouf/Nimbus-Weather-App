package com.example.nimbus.homeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.nimbus.R

@Preview(showBackground = true)
@Composable
fun HomeScreen()
{
    Box(
        modifier = Modifier
            .fillMaxSize(),
    ){
        AsyncImage(
            modifier = Modifier.fillMaxSize(),
            model = ImageRequest
            .Builder(LocalContext.current)
            .data(R.drawable.background)
            .build(),
            contentScale = ContentScale.Crop,
            contentDescription = "" )


    }
}