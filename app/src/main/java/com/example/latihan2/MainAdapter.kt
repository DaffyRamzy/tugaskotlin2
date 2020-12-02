package com.example.latihan2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rvitem.view.*

class MainAdapter (private val items: List<ListObject>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int):MainViewHolder = MainViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.rvitem,p0,false))

    override fun getItemCount() = items.size

    override fun onBindViewHolder(p0: MainViewHolder, p1: Int) {
        p0.bind(items.get(p1), p1+1)
    }

    inner class MainViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        fun bind(item: ListObject, i:Int) {
            view.image_1.text = "$i"
            view.text_1.text = item.name
            view.subtitle_1.text = item.description
        }
    }
}