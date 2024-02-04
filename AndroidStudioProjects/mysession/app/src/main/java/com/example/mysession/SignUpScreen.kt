package com.example.session_4

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mysession.Buttoncomponent
import com.example.mysession.ClickableLoginTextComponent
import com.example.mysession.CreateUserInFirebase
import com.example.mysession.Mytextfield
import com.example.mysession.PasswordMytextfield
import com.example.mysession.R
import com.example.mysession.TextBold
import com.example.mysession.TextNormal


@Composable
fun SignUpScreen(navController: NavController) {
    Surface(

        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),

        ) {
        Column(Modifier.fillMaxSize()) {
            TextNormal(value = "Hello")
            TextBold(value = "Create Account")
            Spacer(modifier = Modifier.height(20.dp))
            Mytextfield(
                labelvalue = "First Name",
                painterResource(id = R.drawable.profile)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Mytextfield(
                labelvalue = "Last Name",
                painterResource = painterResource(id = R.drawable.profile)
            )
            Spacer(modifier = Modifier.height(10.dp))
            val email = Mytextfield(
                labelvalue = "Email",
                painterResource = painterResource(id = R.drawable.message)
            )
            Spacer(modifier = Modifier.height(10.dp))
            val pass = PasswordMytextfield(
                labelvalue = "Password",
                painterResource = painterResource(id = R.drawable.ic_lock)
            )
            Spacer(modifier = Modifier.height(90.dp))
            Buttoncomponent(
                value = "Register"
            ) {
                CreateUserInFirebase(email, pass)
            }
            ClickableLoginTextComponent(tryingToLogin = true, navController)
        }

    }
}

//@Preview
//@Composable
//fun DefaultpreviewSignUpScreen() {
//    SignUpScreen(nav)
//}