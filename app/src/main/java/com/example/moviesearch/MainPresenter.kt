package com.example.moviesearch

import android.util.Log
import com.example.moviesearch.Model.MainModel
import com.example.moviesearch.pojo.MovieSearchResponse
import retrofit2.Response

class MainPresenter(val view: Contract.View) : Contract.Presenter {


    val model = MainModel(this)
    override fun onGetDataFailure(throwable: String) {

        Log.d("TAG", throwable)
    }

    override fun onGetDataSuccess(response: Response<MovieSearchResponse>) {

        Log.d("TAG", response.toString())
        view.showSearchResult(response)
    }

    override fun onSearchButtonClicked() {
        model.searchMovieByName(view.getMovieName())
    }
}