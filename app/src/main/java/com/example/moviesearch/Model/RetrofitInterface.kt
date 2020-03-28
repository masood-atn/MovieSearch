package com.example.moviesearch.Model


import com.example.moviesearch.pojo.MovieSearchResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("search/movie")
    fun searchMovie(@Query("api_key") apiKey: String,
                    @Query("query") movieName: String): Call<MovieSearchResponse>
}