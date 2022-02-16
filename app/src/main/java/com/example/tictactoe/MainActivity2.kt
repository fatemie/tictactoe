package com.example.tictactoe

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoe.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val sharedpreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        binding.buttonRegister.setOnClickListener {
            val editor =  sharedpreferences.edit()

            var name = binding.editTextTextPersonName.getText().toString()
            editor.putString("name", name)

            var username = binding.editTextTextPersonUserName.getText().toString()
            editor.putString("username", username)

            var email = binding.editTextTextEmailAddress.getText().toString()
            editor.putString("email", email)

            var password = binding.editTextTextPersonPassword.getText().toString()
            editor.putString("password", password)



        }


    }
}