package com.example.dependencyinjection

import android.util.Log

class UserRepository {

    fun saveUser(email: String, password: String) {
        Log.d("DAGGER2", "User Saved in DB")
    }

}