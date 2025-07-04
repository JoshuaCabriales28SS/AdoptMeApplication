package com.personal.adoptmeapplication

import android.content.res.Resources
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.text.InputType
import android.text.style.BackgroundColorSpan
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.content.TransferableContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.personal.adoptmeapplication.ui.theme.AdoptMeApplicationTheme
import kotlinx.serialization.builtins.ArraySerializer
import kotlin.math.exp

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdoptMeApplicationTheme {

            }
        }
    }
}

@Composable
fun Textos(contenido: String, modifier: Modifier = Modifier) {
    Text(
        text = contenido,
        fontSize = 32.sp
    )
}

@Composable
fun Header(titulo: String, modifier : Modifier = Modifier) {
    Row(
        modifier = modifier
            .wrapContentSize(align = Alignment.TopCenter)
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = titulo
                .uppercase(),
            fontSize = 45.sp
        )
    }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    // HEADER LOGIN
    Header("Login")

    // CONTENEDOR DE LOGIN
    Column(
        modifier = modifier
            .wrapContentSize()
            .size(450.dp, 250.dp)
            .border(
                width = 4.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = CutCornerShape(8.dp)
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = modifier.padding(16.dp)
        ) {
            Text(
                "Usuario:",
                fontSize = 30.sp
            )
        }
        Row(
            modifier = modifier.padding(16.dp)
        ) {
            Text(
                "Contraseña:",
                fontSize = 30.sp
            )
        }
        Button(
            onClick = { },
            modifier = modifier.padding(16.dp)
        ) {
            Text(
                "Ingresar"
                    .uppercase(),
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun FormScreen(modifier: Modifier = Modifier) {
    // HEADER DEL MAIN
    Header("Formulario")

    // CONTENIDO
    Column(
        modifier = modifier
            .padding(32.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Textos("Tipo de animal: ")
        }
        Row {
            Textos("Raza de animal: ")
        }
        Row {
            Textos("Color de pelaje: ")
        }
    }
}

@Preview(showBackground = true, widthDp = 720, heightDp = 1280)
@Composable
fun ScreenPreview() {
    AdoptMeApplicationTheme {
        FormScreen()
    }
}