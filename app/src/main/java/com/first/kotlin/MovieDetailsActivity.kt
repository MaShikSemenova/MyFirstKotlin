package com.first.kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val button: Button = findViewById<Button>(R.id.back_button)

        button.setOnClickListener { moveToMainScreen() }
    }

    private fun moveToMainScreen(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}