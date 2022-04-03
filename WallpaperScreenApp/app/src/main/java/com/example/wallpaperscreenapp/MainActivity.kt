package com.example.wallpaperscreenapp
import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.Exception

class MainActivity : AppCompatActivity() {

    var bSetWallpaper :Button? = null

    private lateinit var wallImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wallImg = findViewById(R.id.wallpaper)
        val wallInt = intent.extras
        val newWallImg = wallInt!!.getInt("wallImage")
        wallImg.setImageResource(newWallImg)


        val wallPaperManager = WallpaperManager.getInstance(applicationContext)
        bSetWallpaper = findViewById(R.id.set_wallpaper)


        bSetWallpaper!!.setOnClickListener {
            try {
                wallPaperManager.setResource(newWallImg)
            }catch(e:Exception){
                e.printStackTrace()
            }
        }



    }
}