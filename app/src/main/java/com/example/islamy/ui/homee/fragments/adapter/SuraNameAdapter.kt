package com.example.islamy.ui.homee.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamy.R


class SuraNameAdapter(val items: List<String>) :
    RecyclerView.Adapter<SuraNameAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_chapter_name, parent, false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val suraName = items[position]
        holder.name.text = suraName
        if (callBack != null) {
            holder.itemView.setOnClickListener {
                callBack?.onItemClicked(position, suraName)
            }
        }
    }

    override fun getItemCount(): Int = items.size
    var callBack: CallBack? = null

    interface CallBack {
        fun onItemClicked(position: Int, suraName: String)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.sura_item)
    }
}