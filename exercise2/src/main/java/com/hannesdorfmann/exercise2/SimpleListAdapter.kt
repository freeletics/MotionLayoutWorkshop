package com.hannesdorfmann.exercise2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

class SimpleListAdapter(private val inflater: LayoutInflater, @LayoutRes private val layout: Int) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        object : RecyclerView.ViewHolder(inflater.inflate(layout, parent, false)) {}

    override fun getItemCount(): Int = 20

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }
}


