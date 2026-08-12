package com.example.simplecomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.layout.windowInsetsTopHeight
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplecomposable.data.remote.RetrofitClient
import com.example.simplecomposable.domain.PersonaDTO
import com.example.simplecomposable.ui.screen.MultipleComposables.ElevatedCardExample
import com.example.simplecomposable.ui.screen.Persona.PersonCard
import com.example.simplecomposable.ui.theme.Counter
import com.example.simplecomposable.ui.theme.LoginForm
import com.example.simplecomposable.ui.theme.SimpleComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(
                Color.White.copy(alpha = 0.5f).toArgb(),
                Color.White.copy(alpha = 0.5f).toArgb()
            ),
            navigationBarStyle = SystemBarStyle.auto(
                Color.Transparent.toArgb(),
                Color.Transparent.toArgb()
            )
        )

        setContent {
            SimpleComposableTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        val personasState = produceState<List<PersonaDTO>>(initialValue = emptyList()) {
                            value = RetrofitClient.instance.getPersonas()
                        }
                        PersonCard(
                            personas = personasState.value,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    // Overlay semi-transparent soft orange box for status bar
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .windowInsetsTopHeight(WindowInsets.statusBars)
                            .background(Color(0xFFFFCC80).copy(alpha = 0.5f))
                    )
                    // Overlay semi-transparent soft orange box for navigation bar
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .windowInsetsBottomHeight(WindowInsets.navigationBars)
                            .background(Color(0xFFFFCC80).copy(alpha = 0.5f))
                    )
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