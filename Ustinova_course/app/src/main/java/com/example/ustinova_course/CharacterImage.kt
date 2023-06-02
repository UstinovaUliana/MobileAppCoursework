package com.example.ustinova_course

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

data class CharacterImage (
    @DrawableRes val ImageID1 : Int,
    @DrawableRes val nameImage:Int,
    val mainInfo:String,
    val levelUpMaterials: String,
    val talentMaterials: String,
    val imagesWeapon: IntArray,
    val imagesArts: IntArray,
): java.io.Serializable