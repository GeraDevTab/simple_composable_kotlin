package com.example.simplecomposable.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.CloudDone
import androidx.compose.material.icons.outlined.CloudSync
import androidx.compose.material.icons.outlined.Hardware
import androidx.compose.material.icons.outlined.Memory
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simplecomposable.Greeting2
import com.example.simplecomposable.R
import com.example.simplecomposable.ui.theme.ui.theme.SimpleComposableTheme

class MultipleComposables : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    funAlign()
                }
            }
        }
    }
}

//@Composable
//fun UserInfo() {
//    Row {
//        Icon(
//            imageVector = Icons.Default.Person,
//            contentDescription = null
//        )
//        Text(text = "Alex")
//    }
//}

@Composable
fun funAlign() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text= "Profile")
        Button(onClick = {}){
            Text(text = "Edit")
        }
    }
}
@Composable
fun profileScreen2(name: String, modifier: Modifier = Modifier) {
    Column {
        Greeting2()
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        funAlign()
    }
}

//@Composable
//fun SearchBar(modifier: Modifier = Modifier) {
//    TextField(
//        value="",
//        onValueChange = {
//
//        },
//        leadingIcon = {
//            Icon(
//                imageVector = Icons.Default.Search,
//                contentDescription =  null
//            )
//        },
//        colors = TextFieldDefaults.colors(),
//        placeholder = {
//            Text(stringResource(R.string.placeholder_search))
//        },
//        modifier = modifier
//            .fillMaxWidth()
//            .heightIn(min = 56.dp)
//    )
//}

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(16.dp)) {
        var count = 0
        Text("You have had $count glasses")
        Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
            Text("Add one")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarSample() {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = null)
            }
        },
        title = { Text(text = "GVenta") },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.CloudDone,
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.Memory,
                    contentDescription = null
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Outlined.CloudSync,
                    contentDescription = null
                )
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleComposableTheme {
        TopAppBarSample()

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    SimpleComposableTheme {
        funAlign()

    }
}
