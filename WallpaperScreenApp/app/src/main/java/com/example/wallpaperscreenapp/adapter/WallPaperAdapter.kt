package com.example.wallpaperscreenapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaperscreenapp.MainActivity
import com.example.wallpaperscreenapp.R
import com.example.wallpaperscreenapp.model.WallPaperData

class WallPaperAdapter(var c:Context ,var wallImageList:ArrayList<WallPaperData>)
    :RecyclerView.Adapter<WallPaperAdapter.WallPaperViewHolder>()
    {
        inner class WallPaperViewHolder(val v :View):RecyclerView.ViewHolder(v){

            val wallPaperImg = v.findViewById<ImageView>(R.id.wall_img)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallPaperViewHolder {
            val inflater =LayoutInflater.from(parent.context)
            val v = inflater.inflate(R.layout.wall_paper_item,parent, false)
            return WallPaperViewHolder(v)
        }

        override fun onBindViewHolder(holder: WallPaperViewHolder, position: Int) {
          val newListWall = wallImageList[position]
            holder.wallPaperImg.setImageResource(newListWall.wallImage)
            holder.wallPaperImg.setOnClickListener {
                val wallInt = Intent(c,MainActivity::class.java)
                wallInt.putExtra("wallImage",newListWall.wallImage)
                c.startActivity(wallInt)
            }
        }

        override fun getItemCount(): Int = wallImageList.size
    }