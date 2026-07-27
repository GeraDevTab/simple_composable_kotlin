package com.example.simplecomposable.ui.theme.messages

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.remember

val snackbarHostState = remember { SnackbarHostState }

LaunchedEffect(Unit) {
    snackbarHostState.showSnackbar("Task saved successfully")
}