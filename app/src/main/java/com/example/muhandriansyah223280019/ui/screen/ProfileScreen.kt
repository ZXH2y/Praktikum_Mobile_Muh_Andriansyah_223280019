package com.example.muhandriansyah223280019.ui.screen

import android.content.ClipDescription
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.graphics.Brush
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.material.icons.Icons  // jangan lupa import ini untuk icons dawg
import androidx.compose.material.icons.filled.Apartment
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.muhandriansyah223280019.R
import com.example.muhandriansyah223280019.ui.theme.MuhAndriansyah223280019Theme


@Composable
fun ProfileScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primaryContainer,
                        MaterialTheme.colorScheme.primaryContainer,
                    )
                )
            )
    ){
        // start buat box hytam
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.primary,
                            MaterialTheme.colorScheme.secondary
                        )
                    ),
                    shape = RoundedCornerShape(bottomStart = 10.dp, bottomEnd = 20.dp)
                )
        )
        // end box hytam

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp, bottom = 40.dp, start = 20.dp, end = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.TopCenter
            ) {
                // start CARD KOTAK PUTIH
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .padding(top = 60.dp),
                    shape = RoundedCornerShape(size = 24.dp),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 8.dp
                    ),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                ) {
                    // COLUMN isi Card: nama, nim, bio
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(top = 50.dp, bottom = 30.dp, start = 20.dp, end = 20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // TEKS NAMA
                        Text(
                            text = "Muh.Andriansyah",
                            modifier = Modifier.fillMaxWidth(),
                            style = MaterialTheme.typography.headlineMedium
                                .copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    color = MaterialTheme.colorScheme.onSurface
                                ),
                            textAlign = TextAlign.Center
                        )
                        // TEXT NIM
                        Text(
                            text = "Nim: 223280019",
                            modifier = Modifier.fillMaxWidth(),
                            style = MaterialTheme.typography.titleMedium
                                .copy(
                                    fontWeight = FontWeight.Medium,
                                    color = MaterialTheme.colorScheme.primary
                                ),
                            textAlign = TextAlign.Center
                        )
                        // garis pemisah
                        Spacer(modifier = Modifier.height(16.dp)) // jarak kosong vertikal

                        HorizontalDivider(
                            modifier = Modifier.fillMaxWidth(0.3f),
                            thickness = 3.dp,
                            color = MaterialTheme.colorScheme.primaryContainer,
                        )

                        Spacer(modifier = Modifier.height(16.dp))


                        // TEXT untuk BIO
                        Text(
                            text = "saya adalah mahasiswa IT, saya lebih mahir di bidang cybersecurity dan fullstack web dev dibandingkan bidang lain, tapi" +
                                    "saya juga memiliki ketertarikan di bidang AI dan IOT",
                            style = MaterialTheme.typography.bodyLarge,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            lineHeight = 24.sp
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        // LABEL sebelum tombol icon
                        Text(
                            text = "Hubungi saya ",
                            style = MaterialTheme.typography.labelLarge.copy(
                                fontWeight = FontWeight.ExtraBold,
                                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f)
                            )
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        // baris horizontal untuk tombol2 sosial media
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(16.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // tombol wa
                            SocialButton(
                                icon = Icons.Filled.Phone,
                                contentDescription = "WhatApp",
                                color = Color(0xFF25D366),
                                onClick  = {}
                            )
                            SocialButton(
                                icon = Icons.Filled.CameraAlt,
                                contentDescription = "Instagram",
                                color = Color(0xFFFF0000),
                                onClick = {}
                            )
                            SocialButton(
                                icon = Icons.Filled.Apartment,
                                contentDescription = "LinkedIn",
                                color = Color(0xFF87CEEB),
                                onClick = {}
                            )
                        }
                    }
                }
                // start circle foto
                Box(
                    modifier = Modifier
                        .size(120.dp)
                        .border(width = 4.dp, color = MaterialTheme.colorScheme.surface, shape = CircleShape)
                        .clip(CircleShape) // supaya gambar di potong jadi lingkaran
                        .background(color = MaterialTheme.colorScheme.primaryContainer)

                ) {
                    // start content atau image di dalam cirle
                    Image(
                        painter = painterResource(id = R.drawable.andri),
                        contentDescription = "foto profile",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()
                    )
                    // end image
                }
                // end circel foto

            }
        }

    }
}
// supaya icon social button muncul
@Composable
fun SocialButton(
    icon: ImageVector,
    contentDescription: String,
    color: Color,
    onClick: () -> Unit = {}
){
    // icon jadi bundar
    Surface(
        shape = CircleShape,
        color = color.copy(alpha = 0.1f),
        modifier = Modifier.size(50.dp),
        onClick = onClick
    ) {
        Box(contentAlignment = Alignment.Center){
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = color,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
// end untuk social button

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenPreview(){
    MuhAndriansyah223280019Theme{
        ProfileScreen()
    }
}
