package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OutlinedBoutton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_outlined_boutton)

        val btnLogin: Button =findViewById(R.id.btnClick)
        btnLogin.setOnClickListener {
            Toast.makeText(this,"Succes!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PageAfterLogin::class.java)
            startActivity(intent)
        }
    }
}