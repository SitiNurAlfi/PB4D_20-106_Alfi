package com.example.modul2_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul2_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Users>()

        list.addAll(
            arrayOf(
                Users("'AINI"),
                Users("Febi"),
                Users("Ema"),
                Users("Rizal"),
                Users("Thomas"),
                Users("Bima"),
                Users("Adi"),
                Users("Citra"),
                Users("Umi"),
                Users("Diyah")
            )
        )
        val Adapter = MainAdapter(list)
        binding.rView.layoutManager = LinearLayoutManager(this)
        binding.rView.setHasFixedSize(true)
        binding.rView.adapter = Adapter

    }
}