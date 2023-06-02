package com.example.ustinova_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMenu: ImageButton = findViewById<ImageButton>(R.id.btn_menu)
        buttonMenu.setOnClickListener {
            val intent = Intent(this@MainActivity, Menu::class.java)
            startActivity(intent)
        }

    }
}