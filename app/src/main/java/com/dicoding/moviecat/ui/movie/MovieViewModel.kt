package com.dicoding.moviecat.ui.movie

import androidx.lifecycle.ViewModel
import com.dicoding.moviecat.data.MovieEntity
import com.dicoding.moviecat.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovies()
}