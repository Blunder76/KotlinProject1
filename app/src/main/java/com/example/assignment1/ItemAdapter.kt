package com.example.assignment1

import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val dataset: Array<String>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_customview, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardTitle.text = dataset[position]
        holder.view.setOnClickListener{
            Toast.makeText(holder.view.context,"Item clicked ->" + dataset[position], Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cardTitle: TextView = itemView.findViewById(R.id.cardTitle)
        val view = itemView;
    }
}