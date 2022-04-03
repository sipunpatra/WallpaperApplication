package com.example.wallpaperscreenapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.wallpaperscreenapp.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler().postDelayed({
           val intent = Intent(this@WelcomeActivity,WallPaperActivity::class.java)
            startActivity(intent)

        },3000)
    }
}