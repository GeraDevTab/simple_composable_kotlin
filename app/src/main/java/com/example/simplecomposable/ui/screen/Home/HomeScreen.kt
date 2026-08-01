package com.example.simplecomposable.ui.screen.Home

import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(viewModel:HomeViewModel) {
    val uiState by viewModel.uiState.collectAsState()
}

