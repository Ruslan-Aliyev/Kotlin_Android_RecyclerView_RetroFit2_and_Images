package com.example.recyclerview_retrofit2_and_images

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val list: ArrayList<Movie>) : RecyclerView.Adapter<RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return RecyclerViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val movie: Movie = list[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = list.size

}
