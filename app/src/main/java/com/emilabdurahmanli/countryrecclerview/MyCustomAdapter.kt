package com.emilabdurahmanli.countryrecclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import com.emilabdurahmanli.countryrecclerview.data.CountryDTO

class MyCustomAdapter(val list: List<CountryDTO>) :
    RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {
    lateinit var list1: List<CountryDTO>

    init {
        this.list1 = list

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Your holder should contain and initialize a member variable
        // for any view that will be set as you render a row
        val countryNameTextView = itemView.findViewById<TextView>(R.id.textViewCountryname)
        val countryFlagImageView = itemView.findViewById<ImageView>(R.id.countryFlagImageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        Log.d("Lifecycle", "Listden elementi goturdum indi layoutu hazirlayiram")
        val countryItemLayout = inflater.inflate(R.layout.country_item, parent, false)
        // Return a new holder instance
        return ViewHolder(countryItemLayout)
    }

    override fun getItemCount(): Int {
        Log.d("Lifecycle", "Listimizin sayi ${list1.size}")
        return list1.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = list1.get(position)
        Log.d("Lifecycle", "Indi Layouta deyisenleri menimsedirem $position")

        holder.countryNameTextView.setText(country.countryName)
        holder.countryFlagImageView.setImageResource(country.resourceName)
    }


}