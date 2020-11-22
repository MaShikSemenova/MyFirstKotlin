package com.first.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        val button: Button = findViewById(R.id.button_first)
        button.setOnClickListener { moveToMovieDetailsScreen() }

    }

    private fun moveToMovieDetailsScreen(){
    val intent = Intent(this, MovieDetailsActivity::class.java)
        startActivity(intent)
    }

}