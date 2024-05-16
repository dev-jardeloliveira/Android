package br.com.jho.enquete.util

import androidx.compose.foundation.background
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmaiTextField(){
        var text by remember { mutableStateOf(TextFieldValue("")) }
         return OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = { Text("E-Mail")},
            placeholder = { Text("E-mail")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
             leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email")}

        )
}