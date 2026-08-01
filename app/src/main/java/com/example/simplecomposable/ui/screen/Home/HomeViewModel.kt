package com.example.simplecomposable.ui.screen.Home

import androidx.lifecycle.ViewModel

class HomeViewModel(private val repository: UserRepository): ViewModel() {
    fun loadUsers() {
        repository.getUsers()
    }
}