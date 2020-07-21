package com.example.recyclerview_retrofit2_and_images

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewAdapter(private val list: ArrayList<Movie>) : RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val movie: Movie = list[position]
        holder.bind(movie)

        Glide.with(holder.itemView.context)
            .asBitmap()
            .load(list[position].image)
            .into(holder.mImage)
    }

    override fun getItemCount(): Int = list.size

}
