package com.ilham.tugasmodul2ilham

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetailPhoto: ImageView = findViewById(R.id.img_detail_photo)
        val tvDetailName: TextView = findViewById(R.id.tv_detail_name)
        val tvDetailDescription: TextView = findViewById(R.id.tv_detail_description)

        val name = intent.getStringExtra("key_name")
        val description = intent.getStringExtra("key_description")
        val photo = intent.getIntExtra("key_photo", 0)

        tvDetailName.text = name
        tvDetailDescription.text = description
        imgDetailPhoto.setImageResource(photo)
    }
}