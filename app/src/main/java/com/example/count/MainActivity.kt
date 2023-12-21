package com.example.count

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var counteri: Int = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.textView)
        button.setOnClickListener {textView.text = "Hello, friend!"}
        var buttonCounter: Button = findViewById(R.id.button_count)
        buttonCounter.setOnClickListener {textView.text = "Я нажал на кнопку ${++counter} раз"}
        var image: ImageView = findViewById(R.id.image)
        image.setOnClickListener {textView.text = "Я нажал на изображение ${++counteri} раз"}
    }
}