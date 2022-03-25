package com.example.polyuzadmin.screen.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.polyuzadmin.R
import com.example.polyuzadmin.screen.model.ZakazModel

class ZakazListadapter(val items: List<ZakazModel>):RecyclerView.Adapter<ZakazListadapter.MyViewHolder>() {

    inner class MyViewHolder(view : View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.zakaz_list_layout,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = items[position]
    }

    override fun getItemCount(): Int {
        return items.count()
    }
}