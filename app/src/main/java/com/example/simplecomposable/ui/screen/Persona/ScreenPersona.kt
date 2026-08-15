package com.example.simplecomposable.ui.screen.Persona

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.simplecomposable.domain.PersonaDTO

@ExperimentalMaterial3Api
@Composable
fun PersonCard(personas: List<PersonaDTO>, modifier: Modifier = Modifier) {

    val state = rememberCarouselState(itemCount = { personas.count() }, initialItem = 0)

    Column(verticalArrangement = Arrangement.Top, modifier = modifier.padding(top = 36.dp)) {
        HorizontalMultiBrowseCarousel(
            state = state,
            320.dp,
            modifier = Modifier.height(400.dp),
            itemSpacing = 10.dp
        ) { page ->
            val persona = personas[page]

            Box(modifier = Modifier
                .padding(10.dp)
                .background(Color.Blue)
                .fillMaxSize()
                .aspectRatio(0.7f),
                contentAlignment = Alignment.Center
            ) {
                AsyncImage(
                    model = persona.url,
                    contentDescription = "${persona.nombre} ${persona.apellido}",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop)
                Text(text = persona.nombre, fontSize = 32.sp, color = Color.White)
            }
        }
        BottomAppBar(actions = {
            IconButton(onClick = { print("Build") }) {
                Icon(Icons.Filled.Build,
                    contentDescription = "Build description")
            }
            IconButton(onClick = { print("Menu") }) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = "Menu description",
                )
            }
            IconButton(onClick = { print("Favorite") }) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorite description",
                )
            }
            IconButton(onClick = { print("Delete") }) {
                Icon(
                    Icons.Filled.Delete,
                    contentDescription = "Delete description",
                )
            }
            BadgedBox(badge = { Badge { Text("8") } }) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorite"
                )
            }
        },
            containerColor = Color.Green)
    }

    @Composable
    fun BottomAppBarExample() {

    }

//    val layoutDirection = LocalLayoutDirection.current
//    val statusBarPadding = WindowInsets.statusBars.asPaddingValues()
//    val navBarPadding = WindowInsets.navigationBars.asPaddingValues()

//    LazyColumn(
//        modifier = modifier.fillMaxWidth(),
//        contentPadding = PaddingValues(
//            start = 16.dp + statusBarPadding.calculateStartPadding(layoutDirection),
//            top = 190.dp + statusBarPadding.calculateTopPadding(),
//            end = 16.dp + statusBarPadding.calculateEndPadding(layoutDirection),
//            bottom = 16.dp + navBarPadding.calculateBottomPadding()
//        ),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        items(personas) { persona ->
//
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 8.dp)
//                    .background(Color.Blue),
//                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(12.dp)
//                        .background(Color.Gray),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    AsyncImage(
//                        model = persona.url,
//                        contentDescription = "${persona.nombre} ${persona.apellido}",
//                        contentScale = ContentScale.Crop,
//                        modifier = Modifier
//                            .size(550.dp)
//                        //.clip(CircleShape)
//                    )
//                }
//
//            }
//        }
//    }
}

//@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
//@Composable
//fun PersonCardPreview(){
//    PersonCard()
//}