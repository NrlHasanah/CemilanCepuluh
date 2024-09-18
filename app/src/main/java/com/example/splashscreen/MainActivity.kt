package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnLogin: Button =findViewById(R.id.btnClick)
        btnLogin.setOnClickListener {
            Toast.makeText(this,"Succes!",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PageAfterLogin::class.java)
            startActivity(intent)
        }

        val btnSignUp: Button =findViewById(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            Toast.makeText(this,"Sign Up",Toast.LENGTH_SHORT).show()
            val intent = Intent(this, OutlinedBoutton::class.java)
            startActivity(intent)
        }

    }
}