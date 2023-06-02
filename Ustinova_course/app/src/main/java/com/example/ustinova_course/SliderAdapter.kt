package com.example.ustinova_course

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class SliderAdapter(fragment: FragmentActivity, private val images1: IntArray ) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3 //устанавливаем макисмальное число картинок = 3
    override fun createFragment(position: Int): Fragment {
        val fragment = EquipmentFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_IMAGE1, images1[position])
        }
        return fragment
    }
}
