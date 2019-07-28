package com.newple.news

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailText = findViewById(R.id.email_text) as TextView
        val passwordText = findViewById(R.id.password_text) as TextView
        login_button.setOnClickListener {
            //TODO : 로그인 기능 추가
            toast("email : " + emailText.text)
        }

    }
    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}
