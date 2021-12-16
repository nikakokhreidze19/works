package com.example.davaleba3kokhre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    lateinit var alreadyregisteredbtn : Button
    lateinit var usernameEditText : EditText
    lateinit var registerbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alreadyregisteredbtn = findViewById(R.id.alreadyregisteredbtn)


        alreadyregisteredbtn.setOnClickListener{



            val default_Username_intent = Intent( this, MainActivity2::class.java)
            default_Username_intent.putExtra("userName", "HELLO NIKA")
            startActivity(default_Username_intent)

        }
        registerbtn = findViewById(R.id.registerbtn)
        usernameEditText = findViewById(R.id.usernameEditText)


        registerbtn.setOnClickListener {
            val username : String = usernameEditText.text.toString()
            val intent_username = Intent(this,MainActivity2::class.java)
            intent_username.putExtra("userName", username)
            startActivity(intent_username)

        }




    }
}