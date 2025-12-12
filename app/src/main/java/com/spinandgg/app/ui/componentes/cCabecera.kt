package com.spinandgg.app.ui.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.spinandgg.app.R

@Composable
fun AgregarCabecera(onPerfilClick: () -> Unit = {}) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Black)
    ) {
        // Logo (sin cambios)
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp)
                .align(Alignment.Center)
        )


        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = "Perfil",
            modifier = Modifier
                .size(160.dp)
                .align(Alignment.CenterEnd)
                .padding(end = 16.dp)

                .clip(CircleShape) // (Opcional) Hace que la zona de click sea redonda
                .clickable {
                    onPerfilClick() // Ejecuta la acción que le pasemos
                }
        )
    }
}
