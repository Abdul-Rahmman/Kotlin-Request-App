package com.example.samplen.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.samplen.R
import com.example.samplen.model.Request

/**
 * Created by Belal on 6/19/2017.
 */

class CustomAdapter(val RequestList: ArrayList<Request>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(RequestList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return RequestList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(Requests: Request) {
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = Requests.name
            textViewAddress.text = Requests.body
        }
    }
}