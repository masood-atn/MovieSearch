package com.example.moviesearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.moviesearch.pojo.MovieSearchResponse
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response

class MainActivity : AppCompatActivity(), Contract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val presenter = MainPresenter(this)

        imgSearch.setOnClickListener {
            presenter.onSearchButtonClicked()
        }

    }

    override fun getMovieName(): String = edtMovieName.text.toString()
    override fun showSearchResult(response: Response<MovieSearchResponse>) {
        Log.d("TAG2", response.toString())
    }


}