package com.example.task44.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.task44.R
import com.example.task44.model.User

class AgeActivity : AppCompatActivity() {

    private lateinit var ageEt: EditText
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age)

        user = intent.getParcelableExtra(User.USER_MODEL_KEY)!!

        ageEt = findViewById(R.id.ageEt)
        findViewById<Button>(R.id.nextBt).setOnClickListener {
            if (ageEt.text.toString().isBlank()) {
                Toast.makeText(baseContext, "age is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val age = ageEt.text.toString().toInt()
            navigateToEmail(age)
        }
    }

    private fun navigateToEmail(age: Int) {
        val intent = Intent(this, MailActivity::class.java)
        user.age = age
        intent.putExtra(User.USER_MODEL_KEY, user)
        startActivity(intent)
    }
}