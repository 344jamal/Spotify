package com.jamal.spotify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private  val SPLASH_TIME_OUT = 5000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
            finish()
        },SPLASH_TIME_OUT
        )
    }


    }
