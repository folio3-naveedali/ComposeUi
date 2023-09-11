package f3.naveed.samplecompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun LoginPage() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val keyboardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Login",
            //style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        /*BasicTextField(
            value = email,
            onValueChange = { *//*email = it*//* },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = { keyboardController?.show() }
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White)
                .padding(16.dp),
            textStyle = MaterialTheme.typography.bodyMedium,
            placeholder = { *//*Text(text = "Email")*//* }
        )

        BasicTextField(
            value = password,
            onValueChange = { *//*password = it*//* },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = { keyboardController?.hide() }
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White)
                .padding(16.dp),
            textStyle = MaterialTheme.typography.bodyMedium,
            placeholder = { *//*Text(text = "Password")*//* },
            visualTransformation = PasswordVisualTransformation()
        )*/

        Button(
            onClick = {
                // Perform login logic here
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Login")
        }
    }
}