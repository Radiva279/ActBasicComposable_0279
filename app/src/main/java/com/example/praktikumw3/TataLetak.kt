package com.example.praktikumw3

import androidx.compose.runtime.Composable

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(
        modifier = modifier.padding(
            top = 20.dp,
            start = 20.dp,
            end = 20.dp
        )
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}