package com.example.samplen.Adapter

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.SpinnerAdapter
import com.example.samplen.model.Manager
import android.R
import android.content.Context
import android.widget.TextView





class ManagerAdapter(var Managers: List<Manager>,var context: Context) : BaseAdapter(), SpinnerAdapter {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = View.inflate(context, R.layout.simple_spinner_item, null)
        val textView = view.findViewById(R.id.text1) as TextView
        textView.setText(Managers[position].name)
    return view
    }

    override fun getItem(position: Int): Any {
        return Managers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getCount(): Int {
        return Managers.size
    }
}