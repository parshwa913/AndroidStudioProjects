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
import com.example.mysession.Mytextfield
import com.example.mysession.PasswordMytextfield
import com.example.mysession.R
import com.example.mysession.TextBold
import com.example.mysession.TextNormal



@Composable
fun LoginScreen(navController: NavController) {
    Surface(
        color = Color.Unspecified,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
    ) {
        Column() {
            TextNormal("Hello")
            TextBold("Welcome")
            Mytextfield(
                labelvalue = "Email",
                painterResource(id = R.drawable.message)
            )
            Spacer(modifier = Modifier.height(10.dp))
            PasswordMytextfield(
                labelvalue = "Password",
                painterResource = painterResource(id = R.drawable.ic_lock)
            )
            Spacer(modifier = Modifier.height(90.dp))
            Buttoncomponent(
                value = "Login",
                {

                }
            )
            ClickableLoginTextComponent(tryingToLogin = false, navController)
        }
    }
}

//@Preview
//@Composable
//fun defaultpreviewLoginscreen() {
//    LoginScreen()
//}