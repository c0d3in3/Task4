package com.example.task44.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.task44.R
import com.example.task44.model.User

class ResultActivity : AppCompatActivity() {

    private lateinit var user: User
    private lateinit var nameTv: TextView
    private lateinit var ageTv: TextView
    private lateinit var mailTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        user = intent.getParcelableExtra(User.USER_MODEL_KEY)!!

        nameTv = findViewById(R.id.nameTv)
        ageTv = findViewById(R.id.ageTv)
        mailTv = findViewById(R.id.emailTv)

        nameTv.text = "Name: ${user.name}"
        ageTv.text = "Age: ${user.age}"
        mailTv.text = "Mail: ${user.email}"
    }
}