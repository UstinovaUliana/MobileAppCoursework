package com.example.ustinova_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val buttonPyro: ImageButton = findViewById<ImageButton>(R.id.pyroBtn)
        buttonPyro.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "pyro"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonHydro: ImageButton = findViewById<ImageButton>(R.id.hydroBtn)
        buttonHydro.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "hydro"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonAnemo: ImageButton = findViewById<ImageButton>(R.id.anemoBtn)
        buttonAnemo.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "anemo"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonElectro: ImageButton = findViewById<ImageButton>(R.id.electroBtn)
        buttonElectro.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "electro"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonDendro: ImageButton = findViewById<ImageButton>(R.id.dendroBtn)
        buttonDendro.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "dendro"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonCryo: ImageButton = findViewById<ImageButton>(R.id.cryoBtn)
        buttonCryo.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "cryo"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonGeo: ImageButton = findViewById<ImageButton>(R.id.geoBtn)
        buttonGeo.setOnClickListener {
            val intent = Intent(this@Menu, PyroActivity::class.java)
            var element = "geo"
            intent.putExtra(NEXT_SCREEN, element)
            startActivity(intent)
        }
        val buttonBack: ImageButton = findViewById<ImageButton>(R.id.backBtn)
        buttonBack.setOnClickListener {
            val intent = Intent(this@Menu, MainActivity::class.java)
            startActivity(intent)
        }
    }
    companion object{
        val NEXT_SCREEN="details_screen"
    }
}