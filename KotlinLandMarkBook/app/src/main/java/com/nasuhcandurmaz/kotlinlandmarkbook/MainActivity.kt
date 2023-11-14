package com.nasuhcandurmaz.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nasuhcandurmaz.kotlinlandmarkbook.databinding.ActivityMainBinding

var chosenLandmark : Landmark? = null
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()


        //Data

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val eiffel = Landmark("Eiffel","Italy",R.drawable.eiffel)
        val atakum = Landmark("Atakum","Samsun",R.drawable.samsun)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(atakum)



        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = Adapter(landmarkList)
        binding.recyclerView.adapter = adapter


    }
}