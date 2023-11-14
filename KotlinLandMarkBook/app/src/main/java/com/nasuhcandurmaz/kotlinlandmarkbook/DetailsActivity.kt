package com.nasuhcandurmaz.kotlinlandmarkbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nasuhcandurmaz.kotlinlandmarkbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark

        //val selectedLandmark = MySingleton.chosenLandmark

        selectedLandmark?.let {
            binding.countryText.text = it.country
            binding.nameText.text= it.name
            binding.imageView.setImageResource(it.image)
        }


    }
}