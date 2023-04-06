package com.example.modul2_recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modul2_recycleview.databinding.ItemListBinding

class MainAdapter(private val list : ArrayList<Users>) : RecyclerView.Adapter<MainAdapter.Mainviewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Mainviewholder {
        return Mainviewholder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Mainviewholder, position: Int) {
        val data = list [position]
        holder.bind(data)
    }

    class Mainviewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemListBinding.bind(itemView)
        fun bind(data: Users){
            binding.tView1.text = data.name
        }
    }
}