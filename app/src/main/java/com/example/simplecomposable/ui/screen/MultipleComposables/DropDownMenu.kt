package com.example.simplecomposable.ui.screen.MultipleComposables

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DropDownMenu() {
    var expanded by remember { mutableStateOf(false) }
    val contextForToast = LocalContext.current.applicationContext

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "DropdownMenuItem", Modifier.padding(top = 10.dp), fontSize = 20.sp)

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 15.dp)
                .wrapContentSize(align = Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                onClick = {
                    expanded = true
                }
            ) {
                Icon(
                    Icons.Default.MoreVert,
                    contentDescription = "Open Menu"
                )
            }
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = {
                        Text("¡Suscríbete!")
                    },
                    onClick = {
                        Toast.makeText(contextForToast, "¡Suscrito😎!", Toast.LENGTH_SHORT).show()
                        expanded = false
                    },
                    leadingIcon = {
                        Icon(
                            Icons.Outlined.Favorite,
                            contentDescription = null,
                            tint = androidx.compose.ui.graphics.Color.Red
                        )
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text("¡Suscribirse!")
                    },
                    onClick = {
                        Toast.makeText(contextForToast, "Suscribir🙏", Toast.LENGTH_SHORT).show()
                        expanded = false
                    },
                    leadingIcon = {
                        Icon(
                            Icons.Outlined.Check,
                            contentDescription = null,
                            tint = androidx.compose.ui.graphics.Color.DarkGray
                        )
                    }
                )

                DropdownMenuItem(
                    text = {
                        Text("JetpackCompose.pro")
                    },
                    onClick = {
                        Toast.makeText(contextForToast, "JetpackCompose.pro", Toast.LENGTH_SHORT)
                            .show()
                        expanded = false
                    },
                    leadingIcon = {
                        Icon(
                            Icons.Outlined.Home,
                            contentDescription = null,
                            tint = androidx.compose.ui.graphics.Color.DarkGray
                        )
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDropDownMenu() {
    DropDownMenu()
}
