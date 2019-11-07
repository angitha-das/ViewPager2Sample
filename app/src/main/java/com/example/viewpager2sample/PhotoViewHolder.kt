package com.example.viewpager2sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.image_slider_item.view.*

class PhotoViewHolder constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
    constructor(parent: ViewGroup) :
            this(LayoutInflater.from(parent.context).inflate(R.layout.image_slider_item, parent, false))

    fun bind(image: Image, position: Int, size: Int) {
        itemView.txt_counter.text = (position+1).toString()+" of "+size
        itemView.img_photo.setImageResource(image.photo)
        itemView.txt_description.text = image.name
        itemView.but_close.setOnClickListener {

        }
        itemView.but_share.setOnClickListener {

        }
    }
}