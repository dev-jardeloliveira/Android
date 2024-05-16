package br.com.jho.enquete.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.jho.enquete.Navigation
import br.com.jho.enquete.ui.theme.JetsurveyTheme
import br.com.jho.enquete.util.EmaiTextField
import br.com.jho.enquete.util.PasswordTextField
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@Composable
    fun WelcomeScreen(onClikSingIn: () -> Unit) {
    var email = remember {
        mutableStateOf(TextFieldValue(""))
    }
        Column( modifier = Modifier.fillMaxWidth().background(Color.Yellow),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(
                text = "entre ou cria uma conta",
                color = Color.Gray,

            )

            EmaiTextField()

            Button(onClick = { onClikSingIn()},
                Modifier
                    .padding(50.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                Text(text = "entrar")
            }
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "cadastrar", color = Color.Black)
            }
        }
    }


@Preview
@Composable
fun WelcomeScreenPreview(){
    JetsurveyTheme(false) {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            WelcomeScreen{}
        }
    }
}