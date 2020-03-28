package com.example.moviesearch

import com.example.moviesearch.pojo.MovieSearchResponse
import retrofit2.Response

interface Contract {

    interface View {
        fun getMovieName(): String
        fun showSearchResult(response: Response<MovieSearchResponse>)

    }

    interface Presenter {

        fun onGetDataFailure(throwable: String)
        fun onGetDataSuccess(response: Response<MovieSearchResponse>)
        fun onSearchButtonClicked()

    }

}