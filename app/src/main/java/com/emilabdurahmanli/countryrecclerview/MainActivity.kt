package com.emilabdurahmanli.countryrecclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.emilabdurahmanli.countryrecclerview.data.CountryDTO
import com.emilabdurahmanli.countryrecclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var countryList = mutableListOf<CountryDTO>(
        CountryDTO(R.drawable.ic_launcher_background, "Zimbaba"),
        CountryDTO(R.drawable.ic_launcher_foreground, "Canada")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpClickListeners()
    }

    fun setUpClickListeners() {
        var adapter = MyCustomAdapter(countryList)
        var layoutManager  = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recycleView.layoutManager = layoutManager
        binding.recycleView.adapter = adapter


    }
}