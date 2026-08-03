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
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
                    SearchBar()
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

@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    TextField(
        value="",
        onValueChange = {

        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription =  null
            )
        },
        colors = TextFieldDefaults.colors(),
        placeholder = {
            Text(stringResource(R.string.placeholder_search))
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleComposableTheme {
        SearchBar()
    }
}