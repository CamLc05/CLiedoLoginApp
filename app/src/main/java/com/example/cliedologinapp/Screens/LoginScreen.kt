package com.example.cliedologinapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cliedologinapp.Components.CajasTexto
import com.example.cliedologinapp.R
import com.example.cliedologinapp.ui.theme.CLiedoLoginAppTheme

@Composable
fun Login(innerPadding: PaddingValues) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondouno),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .align(Alignment.BottomCenter)
                .clip(RoundedCornerShape(topStart = 70.dp))
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 40.dp, end = 40.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("Login",
                    color = Color.Black,
                    fontSize = 40.sp,
                    modifier = Modifier
                        .padding(bottom = 50.dp),
                )

                CajasTexto(
                    value = email,
                    onValueChange = { email = it },
                    categoria = "Email",
                    texto = "Escribe tu correo"
                )

                CajasTexto(
                    value = password,
                    onValueChange = { password = it },
                    categoria = "Password",
                    texto = "Escribe tu contraseña",
                    contraseña = true
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(280.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black, // Color de fondo del botón
                        contentColor = Color.White           // Color del texto
                    )
                ){
                    Text("Login")
                }

                Text(text = "Don't have any account? Sign up",
                    modifier = Modifier
                        .padding(top = 80.dp))
            }
        }
    }
}




@Preview(
    showBackground =true,
    showSystemUi = true
)

@Composable
fun LoginScreenPreview(){
    CLiedoLoginAppTheme {
        com.example.cliedologinapp.Screens.Login(
            innerPadding = PaddingValues(0.dp)
        )
    }
}