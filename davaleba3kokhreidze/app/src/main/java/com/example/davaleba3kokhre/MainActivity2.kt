package com.example.davaleba3kokhre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast



class MainActivity2 : AppCompatActivity() {

    lateinit var nametextView : TextView
    lateinit var loginbutton : Button
    lateinit var emaileditText : EditText
    lateinit var passwordEditText: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nametextView = findViewById(R.id.nametextView)

        nametextView.text = intent?.extras?.getString("userName", "")
        nametextView.text = intent?.extras?.getString("userName", "")


        loginbutton = findViewById(R.id.loginbtn)
        emaileditText = findViewById(R.id.emailEdiText)
        passwordEditText = findViewById(R.id.passwordEditText)

        loginbutton.setOnClickListener {


            if (emaileditText.text.isEmpty() || passwordEditText.text.isEmpty()) {
                Toast.makeText(this, "please input ", Toast.LENGTH_LONG).show()

            } else if (emaileditText.text.toString() == "admin" && passwordEditText.text.toString() == "admin") {
                Toast.makeText(this, "Correct Password!", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Wrong Password! \nTry again", Toast.LENGTH_SHORT).show()

            }
        }
    }
}