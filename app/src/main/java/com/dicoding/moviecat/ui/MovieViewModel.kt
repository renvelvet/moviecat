package com.dicoding.moviecat.ui

import androidx.lifecycle.ViewModel
import com.dicoding.moviecat.data.MovieEntity
import com.dicoding.moviecat.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()
}