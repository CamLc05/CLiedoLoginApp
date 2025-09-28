package com.example.cliedologinapp.Components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CajasTexto(
    value: String,
    onValueChange: (String) -> Unit,
    categoria: String,
    texto: String,
    contraseña: Boolean = false,
    contraseña2 : Boolean = false
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = categoria,
            color = Color.Black,
            modifier = Modifier
                .padding(start = 16.dp)
        )

        TextField(
            value = value,
            onValueChange = onValueChange,
            placeholder = {
                Text(
                    texto,
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            },
            textStyle = TextStyle(
                color = Color.Gray,
                fontSize = 16.sp
            ),
            singleLine = true,
            visualTransformation = when {
                contraseña -> PasswordVisualTransformation()
                contraseña2 -> PasswordVisualTransformation()
                else -> VisualTransformation.None
            },
            modifier = Modifier
                .padding(bottom = 20.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }
}

