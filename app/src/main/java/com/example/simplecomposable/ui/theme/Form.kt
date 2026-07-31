package com.example.simplecomposable.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NameField() {
    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text("Names") }
    )
}

@Composable
fun LoginForm() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val isValid = email.isNotBlank() && password.isNotBlank()

    Column {
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it },
            label = {
                Text("Email")
            }
        )
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it },
            label = {
                Text("Password")
            }
        )
        Button(
            onClick = { },
            enabled = isValid
        ) {
            Text("Sign in")
        }
    }
}

//@Composable
//fun SubmitButton() {
//
//}

@Preview(showBackground = true)
@Composable
fun NameFieldPreview() {
    LoginForm()
}

//@Preview(showBackground = true)
//@Composable
//fun ButtonSubmitPreview() {
//    SubmitButton()
//}
