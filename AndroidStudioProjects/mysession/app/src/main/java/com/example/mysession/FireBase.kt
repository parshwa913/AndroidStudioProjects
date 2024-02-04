package com.example.mysession

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth

class Firebase : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

    }

}

fun CreateUserInFirebase(email: String, password: String) {
    FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
}