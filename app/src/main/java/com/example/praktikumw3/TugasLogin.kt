package com.example.praktikumw3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier = Modifier){
    val background = painterResource(id = R.drawable.background)
    val gambarStart = painterResource(id = R.drawable.start)
    val gambarOrang = painterResource(id = R.drawable.prabowogibran)
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 65.dp,
                    start = 15.dp,
                    end = 15.dp,
                    bottom = 15.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Login",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Spacer(
                modifier = Modifier.height(3.dp)
            )

            Text(
                text = "Silahkan klik Start untuk Login",
                fontSize = 18.sp,
                color = Color.White
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Image(
                painter = gambarStart,
                contentDescription = "Start",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(
                modifier = Modifier.height(35.dp)
            )

            Text(
                    text = "Radiva Galih Nofriyanto",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            Text(
                text = "20240140279",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(
                modifier = Modifier.height(50.dp)
            )

            Image(
                painter = gambarOrang,
                contentDescription = "Foto",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(175.dp)
                    .clip(
                        RoundedCornerShape(15.dp)
                    ),
                contentScale = ContentScale.Crop
            )
        }
    }
}