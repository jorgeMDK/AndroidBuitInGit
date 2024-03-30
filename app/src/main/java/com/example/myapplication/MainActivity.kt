package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ButtonSaludar:Button = findViewById(R.id.button_saludar)
        val ButtonDespedirse:Button = findViewById(R.id.button_despedirse)
        val ButtonChocar:Button = findViewById(R.id.button_chocar)


    }
}