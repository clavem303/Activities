package com.clavem303.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.clavem303.activities.classes.WriteBoard
import com.clavem303.activities.screens.PhrasesActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textViewNotice: TextView
    private lateinit var buttonPhrases: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initViews()
    }

    private fun initViews() {
        textViewNotice = findViewById(R.id.textViewNotice)
        textViewNotice.text = WriteBoard().notice

        buttonPhrases = findViewById(R.id.buttonPhrases)
        buttonPhrases.setOnClickListener {
            val intent = Intent(this, PhrasesActivity::class.java)
            startActivity(intent)
        }
    }
}