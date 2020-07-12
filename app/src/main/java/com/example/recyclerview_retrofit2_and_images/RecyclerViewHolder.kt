package com.example.recyclerview_retrofit2_and_images

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item, parent, false)) {

    private var mTitleView: TextView? = null
    private var mYearView: TextView? = null

    init {
        mTitleView = itemView.findViewById(R.id.list_title)
        mYearView = itemView.findViewById(R.id.list_description)
    }

    fun bind(movie: Movie) {
        mTitleView?.text = movie.title
        mYearView?.text = movie.year.toString()
    }

}