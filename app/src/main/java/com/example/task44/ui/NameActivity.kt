package com.example.task44.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.task44.R
import com.example.task44.model.User

class NameActivity : AppCompatActivity() {
    private lateinit var nameEt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        nameEt = findViewById(R.id.nameEt)
        findViewById<Button>(R.id.nextBt).setOnClickListener {
            if(nameEt.text.toString().isBlank()) {
                Toast.makeText(baseContext, "name is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val name = nameEt.text.toString()
            navigateToAge(name)
        }
    }

    private fun navigateToAge(name: String) {
        val intent = Intent(this, AgeActivity::class.java)
        val user = User(name = name)
        intent.putExtra(User.USER_MODEL_KEY, user)
        startActivity(intent)
    }

}