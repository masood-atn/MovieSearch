package com.example.moviesearch

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesearch.pojo.MovieSearchResponse

import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_item.view.*


class RecyclerAdapter(private val items : List<String>, private val clickListener: (String) -> Unit) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(v, clickListener)
    }

    override fun getItemCount() = items.size




    class ViewHolder(
        val item: View,
        private val clickListener: (String) -> Unit
    ) : RecyclerView.ViewHolder(item){

        fun onBind(name: String){
            item.movie_name.text = name
            item.setOnClickListener{clickListener(name)}

        }


    }

    override fun onBindViewHolder(holder: ListAdapter.ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}



