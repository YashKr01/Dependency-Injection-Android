package com.example.dependencyinjection

import android.util.Log

class EmailService {

    fun send(to:String, from:String, body:String) {
        Log.d("DAGGER2", "Email Sent")
    }

}