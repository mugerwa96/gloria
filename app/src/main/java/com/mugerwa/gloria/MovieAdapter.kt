package com.mugerwa.gloria

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val context: Context,val movies:List<Movie>):RecyclerView.Adapter<MovieAdapter.ViewHolder>() {


//accessing the card design layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.card_design,parent,false)
        return ViewHolder(view)
    }

//    binding view which  is the card desig layout with the view holder


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie=movies[position]
        holder.desc.text=movie.description
        holder.title.text=movie.title
        holder.image.setImageResource(movie.image)
    }

//    returning the size of the list of moviea
    override fun getItemCount(): Int {
       return movies.size
    }
    //    view holder helps us in accessing the ids in the card design layout
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title=itemView.findViewById<TextView>(R.id.textView)
        val image=itemView.findViewById<ImageView>(R.id.imageView2)
        val desc=itemView.findViewById<TextView>(R.id.descr)

    }
}