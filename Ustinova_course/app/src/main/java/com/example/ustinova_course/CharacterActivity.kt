package com.example.ustinova_course

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2


class CharacterActivity : FragmentActivity() {

    private lateinit var adapterWeapon: SliderAdapter
    private lateinit var adapterArts: SliderAdapter
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)
        //получение данных передваемого персонажа
        var emplist:CharacterImage?=null
        if(intent.hasExtra(PyroActivity.NEXT_SCREEN)){
            emplist =
                intent.getSerializableExtra(PyroActivity.NEXT_SCREEN) as CharacterImage?
        }
        //передача данных в компоненты экрана
        if(emplist!=null){
            val textName = findViewById<ImageView>(R.id.imageViewName)
            textName.setImageResource(emplist!!.nameImage)
            val textMainInfo=findViewById<TextView>(R.id.textViewMainInfo)
            textMainInfo.setText(emplist!!.mainInfo)
            val textLevelMats = findViewById<TextView>(R.id.textViewLevelUpMats)
            textLevelMats.setText(emplist!!.levelUpMaterials)
            val textTalentMats=findViewById<TextView>(R.id.textViewTalentsMats)
            textTalentMats.setText(emplist!!.talentMaterials)
            adapterWeapon = SliderAdapter(this,emplist!!.imagesWeapon)
            viewPager = findViewById(R.id.pager)
            viewPager.adapter = adapterWeapon
            adapterArts = SliderAdapter(this,emplist!!.imagesArts)
            viewPager = findViewById(R.id.pager2)
            viewPager.adapter = adapterArts
        }
        val buttonBack: ImageButton = findViewById<ImageButton>(R.id.backBtn)
        buttonBack.setOnClickListener {
            val intent = Intent(this@CharacterActivity, Menu::class.java)
            startActivity(intent)
        }

    }

}