package com.example.simplecomposable.ui.screen.MultipleComposables

import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Composable
fun DefaultSnackbar() {
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                //text = { Text("Show snackbar") },
                onClick = {
                    scope.launch {
                        val result = snackbarHostState.showSnackbar(
                            message = "Snackbar",
                            actionLabel = "Acción",
                            duration = SnackbarDuration.Short,

                        )
                        when (result) {
                            SnackbarResult.ActionPerformed -> {
                                //Si presiono la acción del snackbar
                            }
                            SnackbarResult.Dismissed -> {
                                // Si ignoras el snackbar
                            }
                        }
                    }
                }
            ) {
                Text("Mostrar Snackbar")
            }
        }
    ) { contentPadding ->
        {
            //do something//
            //Text(text="Snackbar")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun previwDefaultSnackbar() {
    DefaultSnackbar()
    
}