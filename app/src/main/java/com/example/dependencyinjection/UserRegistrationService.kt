package com.example.dependencyinjection

class UserRegistrationService(
    private val repository: UserRepository,
    private val emailService: EmailService,
) {

    fun registerUser(email: String, password: String) {
        repository.saveUser(email, password)
        emailService.send(email, "no-reply@gmail.com", "User Registered")
    }

}