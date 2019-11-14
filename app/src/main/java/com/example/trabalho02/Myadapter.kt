package com.example.trabalho02

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Myadapter(private val var_users: MutableList<Class_User>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return var_users.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text=var_users[position].name
        holder.delete.setOnClickListener {
            var_users.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position,var_users.size)
        }

    }

    fun addUser(user:Class_User){
        var_users.add(user)
        notifyItemInserted(itemCount)
    }

}