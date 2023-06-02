package com.example.ustinova_course.recyclerView

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.ustinova_course.CharacterImage
import com.example.ustinova_course.MainActivity
import com.example.ustinova_course.R

class Adapter (Context: Context, private val items: List<CharacterImage>,)
    :RecyclerView.Adapter<Adapter.ViewHolder> () {
    private var onClickListener: OnClickListener?=null
    private val inflater: LayoutInflater = LayoutInflater.from(Context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(inflater.inflate(R.layout.character, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.imagebtn1.setImageResource(getItem(position).ImageID1)
        holder.imagebtn1.setOnClickListener {
            if (onClickListener != null) {
                onClickListener!!.onClick(position, item )
            }
        }
    }
    override fun getItemCount(): Int {
        return items.size
    }
    interface OnClickListener {
        fun onClick(position: Int, model: CharacterImage)
    }
    private fun getItem(position:Int) : CharacterImage = items[position]

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }
    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imagebtn1 : ImageButton = itemView.findViewById(R.id.charbtn)
    }

}













