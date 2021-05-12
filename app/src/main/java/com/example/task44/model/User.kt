package com.example.task44.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(var name: String, var age: Int? = null, var email: String? = null) : Parcelable {

    companion object {
        val USER_MODEL_KEY = this::class.java.toString()
    }
}