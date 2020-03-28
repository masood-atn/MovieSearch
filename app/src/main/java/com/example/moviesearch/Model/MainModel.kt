package com.example.moviesearch.Model

import com.example.moviesearch.Contract
import com.example.moviesearch.pojo.MovieSearchResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainModel(val presenter: Contract.Presenter) {

    fun searchMovieByName(MovieName: String) {


        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        val searchInterface = retrofit.create(RetrofitInterface::class.java)

        val apiKey = "cd84d4b4036342dce088a16a5b753cbf"
        searchInterface.searchMovie(apiKey, MovieName)
            .enqueue(object : Callback<MovieSearchResponse> {

                override fun onFailure(call: Call<MovieSearchResponse>, t: Throwable) {
                    presenter.onGetDataFailure(t.message.toString())
                }

                override fun onResponse(
                    call: Call<MovieSearchResponse>,
                    response: Response<MovieSearchResponse>
                ) {
                    presenter.onGetDataSuccess(response)
                }

            })

    }
}