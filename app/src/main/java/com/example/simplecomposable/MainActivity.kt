package com.example.simplecomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecomposable.ui.theme.LoginForm
import com.example.simplecomposable.ui.theme.SimpleComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SimpleComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginForm()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Greeting2() {
    Text(text = "Hello, Jetpack Compose!")
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SimpleComposableTheme {
//        Greeting("Android")
//    }
//}

@Preview(showBackground = true)
@Composable
fun Greeting2Preview() {
    SimpleComposableTheme {
        Greeting2()
        //Greeting2()
    }
}