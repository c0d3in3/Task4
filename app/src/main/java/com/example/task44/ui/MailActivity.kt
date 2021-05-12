package com.example.task44.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.task44.R
import com.example.task44.model.User

class MailActivity : AppCompatActivity() {
    private lateinit var mailEt: EditText
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mail)

        user = intent.getParcelableExtra(User.USER_MODEL_KEY)!!

        mailEt = findViewById(R.id.mailEt)
        findViewById<Button>(R.id.nextBt).setOnClickListener {
            if (mailEt.text.toString().isBlank()) {
                Toast.makeText(baseContext, "mail is empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val mail = mailEt.text.toString()
            navigateToResult(mail)
        }
    }

    private fun navigateToResult(mail: String) {
        val intent = Intent(this, ResultActivity::class.java)
        user.email = mail
        intent.putExtra(User.USER_MODEL_KEY, user)
        startActivity(intent)
    }
}