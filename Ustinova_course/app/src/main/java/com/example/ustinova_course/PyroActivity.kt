package com.example.ustinova_course

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.ustinova_course.data.*
import com.example.ustinova_course.recyclerView.Adapter

class PyroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyro)
        var emplist:String?=null
        val characters: List<CharacterImage>
        val list = findViewById<RecyclerView>(R.id.charList)
        val elementImage = findViewById<ImageView>(R.id.imageViewElement)
        if(intent.hasExtra(Menu.NEXT_SCREEN)){
            emplist =
                intent.getSerializableExtra(Menu.NEXT_SCREEN) as String
            when (emplist) {
                "pyro" -> {
                    val characters = dataStorage.getVersionsList()
                    elementImage.setImageResource(R.drawable.pyro_bg)
                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
                "anemo" -> {
                    val characters = DataStorageAnemo.getVersionsList()
                    elementImage.setImageResource(R.drawable.anemo_bg)

                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
                "cryo" -> {
                    val characters = DataStorageCryo.getVersionsList()
                    elementImage.setImageResource(R.drawable.cryo_bg)

                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
                "dendro" -> {
                    val characters = DataStorageDendro.getVersionsList()
                    elementImage.setImageResource(R.drawable.dendro_bg)

                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
                "electro" -> {
                    val characters = DataStorageElectro.getVersionsList()
                    elementImage.setImageResource(R.drawable.electro_bg)

                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
                "geo" -> {
                    val characters = DataStorageGeo.getVersionsList()
                    elementImage.setImageResource(R.drawable.geo_bg)

                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
                "hydro" -> {
                    val characters = DataStorageHydro.getVersionsList()
                    elementImage.setImageResource(R.drawable.hydro_bg)

                    val adapter = Adapter(this, characters);
                    list.adapter = adapter
                    adapter.setOnClickListener(object :
                        Adapter.OnClickListener {
                        override fun onClick(position: Int, model: CharacterImage) {
                            val intent = Intent(this@PyroActivity, CharacterActivity::class.java)
                            intent.putExtra(NEXT_SCREEN, model)
                            startActivity(intent)
                        }
                    })
                }
            }
        }
        val buttonBack: ImageButton = findViewById<ImageButton>(R.id.backBtn)
        buttonBack.setOnClickListener {
            val intent = Intent(this@PyroActivity, Menu::class.java)
            startActivity(intent)
        }

    }
    companion object{
        val NEXT_SCREEN="details_screen"
    }


}