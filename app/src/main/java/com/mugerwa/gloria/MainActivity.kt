package com.mugerwa.gloria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        accessing  recycler id
        val recycler=findViewById<RecyclerView>(R.id.recycler)
//        movies list
        val movies= mutableListOf<String>(
            "X-MEN",
            "SPIDER MAN",

        )

//        list of images
        val images= mutableListOf<Int>(

            R.drawable.imagex,
            R.drawable.image
        )

//        lsit of descriptions
        val descriptions= mutableListOf<String>(
            "X_MEN is a marval moviesmddmsdms dmsmds",
            "Home coming spider man is now on netflix"
        )


//        collection of all movies and their details

        val list= mutableListOf<Movie>()

        for(i in movies.indices){
            list.add(Movie(movies[i],images[i],descriptions[i]))
        }

//        Movies Adapter takes in two parameters, the context which is this and movies list
//        "movies list=list"
//        context="this
        recycler.adapter=MovieAdapter(this,list)
        recycler.layoutManager=LinearLayoutManager(this)
    }
}