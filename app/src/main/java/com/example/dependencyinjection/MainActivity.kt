package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = UserRepository()
        val emailService = EmailService()

        val registrationService = UserRegistrationService(repository, emailService)
        registrationService.registerUser("random21@gmail.com", "password")

    }

}