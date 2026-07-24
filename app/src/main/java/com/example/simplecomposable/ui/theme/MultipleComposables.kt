package com.example.simplecomposable.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecomposable.Greeting2
import com.example.simplecomposable.ui.theme.ui.theme.SimpleComposableTheme

class MultipleComposables : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    profileScreen2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleComposableTheme {
        profileScreen2("Android")
    }
}