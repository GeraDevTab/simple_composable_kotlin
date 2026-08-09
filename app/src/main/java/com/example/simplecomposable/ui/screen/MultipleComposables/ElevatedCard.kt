package com.example.simplecomposable.ui.screen.MultipleComposables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.simplecomposable.R
import java.nio.file.WatchEvent

@Composable
fun ElevatedCardExample() {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 16.dp
        ),
        modifier = Modifier
            .size(width = 240.dp, height = 350.dp)
    ) {
        Text(
            text = "Elevated",
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
        )
        Image(
            painter = painterResource(id = R.drawable.pitaya_juice_thumb),
            contentDescription = "pihaya fruta",
            modifier = Modifier.size(80.dp)
        )
        Spacer(modifier = Modifier)
        AsyncImage(
            model = "lacasadeel.net/wp-content/uploads/2025/01/alien-scaled.jpg.webp",
            contentDescription = "image desde la nube",
            modifier = Modifier.size(80.dp))


    }
}

@Preview(showBackground = true)
@Composable
fun ElevatedCardExamplePreview() {
    ElevatedCardExample()
}