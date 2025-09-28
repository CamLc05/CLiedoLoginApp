package com.example.cliedologinapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cliedologinapp.Components.CajasTexto
import com.example.cliedologinapp.R
import com.example.cliedologinapp.ui.theme.CLiedoLoginAppTheme

@Composable
fun Register(innerPadding: PaddingValues, navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var password2 by remember { mutableStateOf("") }
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }



    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.fondouno),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Regresar",
                    tint = Color.White
                )
            }

            Text(
                "Sign Up",
                color = Color.White,
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(start = 70.dp)
            )
        }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(700.dp)
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
                CajasTexto(
                    value = firstname,
                    onValueChange = { firstname = it },
                    categoria = "First name",
                    texto = "Escribe tu nombre"
                )

                CajasTexto(
                    value = lastname,
                    onValueChange = { lastname = it },
                    categoria = "Last name",
                    texto = "Escribe tus apellidos"
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

                CajasTexto(
                    value = password2,
                    onValueChange = { password2 = it },
                    categoria = "Confirma tu contraseña",
                    texto = "Escribe nuevamente tu contraseña",
                    contraseña2 = true
                )


                Button(
                    onClick = {},
                    modifier = Modifier
                        .width(280.dp)
                        .height(55.dp),
                    shape = RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    )
                ){
                    Text("Sign Up")
                }

                TextButton(onClick = { navController.navigate("login") },
                    shape = RoundedCornerShape(1.dp)) {
                    Text("Already have an account? Sign In",
                        color = Color.Black
                    )
                }
            }
        }
    }
}




@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun RegisterScreenPreview(){
    CLiedoLoginAppTheme {
        Register(
            innerPadding = PaddingValues(0.dp),
            navController = rememberNavController()
        )
    }
}