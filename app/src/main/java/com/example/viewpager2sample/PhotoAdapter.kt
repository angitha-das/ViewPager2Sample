package com.example.viewpager2sample

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PhotoAdapter : RecyclerView.Adapter<PhotoViewHolder>() {
    var list: List<Image> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(parent)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(list[position],position,list.size)
    }

    fun setItem(list: List<Image>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size
}
