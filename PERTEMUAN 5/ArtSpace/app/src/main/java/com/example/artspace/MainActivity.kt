package com.example.artspace // Ganti dengan nama package Anda jika berbeda

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}

@Composable
fun ArtSpaceApp() {
    var currentArtwork by remember { mutableStateOf(1) }

    val imageResource = when (currentArtwork) {
        1 -> R.drawable.porsche
        2 -> R.drawable.bmw_m3
        else -> R.drawable.bmw_m4
    }
    val title = when (currentArtwork) {
        1 -> "PORSCHE"
        2 -> "BMW M3"
        else -> "BMW M4"
    }
    val artist = when (currentArtwork) {
        1 -> "This car is owned by FAJAR"
        2 -> "This car is owned by ADIT"
        else -> "This car is owned by LUKMAN"
    }
    val year = when (currentArtwork) {
        1 -> "2025"
        2 -> "2024"
        else -> "2026"
    }

    // 1. MENDETEKSI ORIENTASI LAYAR
    val configuration = LocalConfiguration.current
    val isPortrait = configuration.orientation == Configuration.ORIENTATION_PORTRAIT

    // 2. LOGIKA TATA LETAK RESPONSIF
    if (isPortrait) {
        // --- MODE PONSEL BERDIRI (PORTRAIT) ---
        // Gambar di atas, tombol di bawah
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ArtworkDisplay(currentImage = imageResource)
            Spacer(modifier = Modifier.height(32.dp))
            ArtworkDescriptor(title = title, artist = artist, year = year)
            Spacer(modifier = Modifier.height(32.dp))
            TombolNavigasi(
                onPrevClick = { if (currentArtwork > 1) currentArtwork-- else currentArtwork = 3 },
                onNextClick = { if (currentArtwork < 3) currentArtwork++ else currentArtwork = 1 }
            )
        }
    } else {
        // --- MODE TABLET ATAU MENDATAR (LANDSCAPE) ---
        // Gambar di kiri, tombol di kanan
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(modifier = Modifier.weight(1f)) {
                ArtworkDisplay(currentImage = imageResource)
            }
            Spacer(modifier = Modifier.width(32.dp))
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ArtworkDescriptor(title = title, artist = artist, year = year)
                Spacer(modifier = Modifier.height(32.dp))
                TombolNavigasi(
                    onPrevClick = { if (currentArtwork > 1) currentArtwork-- else currentArtwork = 3 },
                    onNextClick = { if (currentArtwork < 3) currentArtwork++ else currentArtwork = 1 }
                )
            }
        }
    }
}

// Komponen Pembantu: Diubah menjadi fungsi terpisah agar kode utama lebih rapi
@Composable
fun TombolNavigasi(onPrevClick: () -> Unit, onNextClick: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = onPrevClick, modifier = Modifier.weight(1f)) {
            Text(text = "Previous")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(onClick = onNextClick, modifier = Modifier.weight(1f)) {
            Text(text = "Next")
        }
    }
}

@Composable
fun ArtworkDisplay(currentImage: Int) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .border(3.dp, Color.LightGray)
            .padding(16.dp),
        shadowElevation = 8.dp,
        color = Color.White
    ) {
        Image(
            painter = painterResource(id = currentImage),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp),
            contentScale = ContentScale.Fit // Memastikan gambar tidak terpotong (Fit)
        )
    }
}

@Composable
fun ArtworkDescriptor(title: String, artist: String, year: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFECEFF1))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
            fontSize = 24.sp,
            fontWeight = FontWeight.Light
        )
        Row {
            Text(text = artist, fontWeight = FontWeight.Bold, fontSize = 16.sp)
            Text(text = " ($year)", fontSize = 16.sp, color = Color.Gray)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}