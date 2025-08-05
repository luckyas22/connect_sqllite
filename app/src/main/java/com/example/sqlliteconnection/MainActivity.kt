package com.example.sqlliteconnection
import android.content.Intent
import android.os.Bundle
//import android.widget.Button
//import androidx.activity.enableEdgeToEdge
//import android.widget.TextView
//import android.widget.Toast
import android.widget.*

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        // Ambil username dari intent
        val username = intent.getStringExtra("username") ?: "User"
        tvWelcome.text = "Selamat Datang, $username"
        btnLogout.setOnClickListener {
            Toast.makeText(this, "Berhasil logout", Toast.LENGTH_SHORT).show()

            // Kembali ke LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Tutup MainActivity agar tidak bisa kembali dengan tombol back
            finish()
        }
    }
}