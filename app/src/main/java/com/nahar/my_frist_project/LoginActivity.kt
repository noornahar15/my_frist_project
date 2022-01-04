package com.nahar.my_frist_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.widget.TextView
import android.widget.Toast


class LoginActivity : AppCompatActivity() {
    private lateinit var emailEt: EditText
    private lateinit var passwordEt: EditText
    private lateinit var loginBtn: Button
    private lateinit var clickTv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        emailEt = findViewById(R.id.emailLog_et)
        passwordEt = findViewById(R.id.passwordLog_et)
        loginBtn = findViewById(R.id.login_btn)
        clickTv = findViewById(R.id.click_tv)

        val intentEmail: String = intent.getStringExtra("email").toString()
        val intentPass: String = intent.getStringExtra("password").toString()

        loginBtn.setOnClickListener {
            val email: String = emailEt.text.toString()
            val password: String = passwordEt.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                if (email == intentEmail && password == intentPass) {

                    val intent = Intent(this, DashboardActivity::class.java)
                    startActivity(intent)

                    Toast.makeText(this, "login successfully", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Email or password not mach", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Email or password not mach", Toast.LENGTH_LONG).show()
            }
        }

        clickTv.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)

        }
    }
}