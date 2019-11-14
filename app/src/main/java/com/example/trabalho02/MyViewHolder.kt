package com.example.trabalho02

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyViewHolder (var_itemview: View): RecyclerView.ViewHolder(var_itemview){

    var title: TextView =var_itemview.findViewById(R.id.textlayout_recycler)
    var delete: ImageButton = var_itemview.findViewById(R.id.imageButtonlayout_recycler)

}
