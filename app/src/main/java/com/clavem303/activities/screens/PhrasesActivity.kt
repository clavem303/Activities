package com.clavem303.activities.screens

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.clavem303.activities.R
import com.clavem303.activities.classes.WriteBoard

class PhrasesActivity : AppCompatActivity() {

    private lateinit var textViewPhrases: TextView
    private lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_phrases)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initViews()
    }

    private fun initViews() {
        textViewPhrases = findViewById(R.id.textViewPhrases)
        textViewPhrases.text = ""
        for (phrase in WriteBoard().phrases) {
            textViewPhrases.append("* $phrase\n\n")
        }

        buttonBack = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener {
            finish()
        }
    }
}