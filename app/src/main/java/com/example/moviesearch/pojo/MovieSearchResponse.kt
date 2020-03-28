package com.example.moviesearch.pojo

data class MovieSearchResponse(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)