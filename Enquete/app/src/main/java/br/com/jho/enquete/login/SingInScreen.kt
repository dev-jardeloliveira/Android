package br.com.jho.enquete.login

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SingInScreen(
    onClickWelcome:()->Unit,
    onClickSignUp: () -> Unit
){
Column {
     Text(text = "SignIn")
}
}