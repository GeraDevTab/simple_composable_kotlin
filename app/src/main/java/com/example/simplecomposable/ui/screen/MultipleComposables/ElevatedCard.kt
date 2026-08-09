package com.example.simplecomposable.ui.screen.MultipleComposables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.simplecomposable.R

@Composable
fun ElevatedCardExample() {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().background(Color.LightGray),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Spacer(Modifier.windowInsetsTopHeight(WindowInsets.statusBars))
            }
            item {
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 16.dp
                    ),
                    modifier = Modifier
                        .size(width = 593.dp, height = 741.dp)
                        .background(Color.Blue)
                    ) {
//        Text(
//            text = "Elevated",
//            modifier = Modifier
//                .padding(16.dp),
//            textAlign = TextAlign.Center,
//        )
//        Image(
//            painter = painterResource(id = R.drawable.pitaya_juice_thumb),
//            contentDescription = "pihaya fruta",
//            modifier = Modifier.size(80.dp)
//        )
//        Spacer(modifier = Modifier.size(10.dp))
                    AsyncImage(
                        model = "https://lacasadeel.net/wp-content/uploads/2025/01/alien-scaled.jpg.webp",
                        contentDescription = "image desde la nube",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
            //Spacer(modifier = Modifier.size(10.dp))
            item {
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 16.dp
                    ),
                    modifier = Modifier
                        .size(width = 593.dp, height = 741.dp)
                ) {
//        Text(
//            text = "Elevated",
//            modifier = Modifier
//                .padding(16.dp),
//            textAlign = TextAlign.Center,
//        )
//        Image(
//            painter = painterResource(id = R.drawable.pitaya_juice_thumb),
//            contentDescription = "pihaya fruta",
//            modifier = Modifier.size(80.dp)
//        )
//        Spacer(modifier = Modifier.size(10.dp))
                    AsyncImage(
                        model = "https://i.pinimg.com/564x/b7/aa/60/b7aa604430336da96a01f5c8feea8419.jpg",
                        contentDescription = "image desde la nube",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }

            item {
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 16.dp
                    ),
                    modifier = Modifier
                        .size(width = 593.dp, height = 741.dp)
                ) {
//        Text(
//            text = "Elevated",
//            modifier = Modifier
//                .padding(16.dp),
//            textAlign = TextAlign.Center,
//        )
//        Image(
//            painter = painterResource(id = R.drawable.pitaya_juice_thumb),
//            contentDescription = "pihaya fruta",
//            modifier = Modifier.size(80.dp)
//        )
//        Spacer(modifier = Modifier.size(10.dp))
                    AsyncImage(
                        model = "https://lacasadeel.net/wp-content/uploads/2025/01/alien-scaled.jpg.webp",
                        contentDescription = "image desde la nube",
                        modifier = Modifier.size(600.dp)
                    )
                }
            }
        }

        // Overlay for status bar
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsTopHeight(WindowInsets.statusBars)
                .background(Color.White.copy(alpha = 0.5f))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ElevatedCardExamplePreview() {
    ElevatedCardExample()
}