package com.example.pragatisintentapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

            val btn1 = findViewById<Button>(R.id.button2)
            btn1.setOnClickListener {
                val intent1 = Intent(this, MainActivity3::class.java)
                startActivity(intent1)
            }

                val btn2 = findViewById<Button>(R.id.button3)
                btn2.setOnClickListener {
                    val intent2 = Intent(this, MainActivity4::class.java)
                    startActivity(intent2)
                }



    }
}
