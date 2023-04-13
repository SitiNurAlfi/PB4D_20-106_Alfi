package com.example.wame

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btmove)
        btn1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })

        val btn2 = findViewById<Button>(R.id.btwa)
        btn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/"))
            startActivity(intent)
        })
    }
}