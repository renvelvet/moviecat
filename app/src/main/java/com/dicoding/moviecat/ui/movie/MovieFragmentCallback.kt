package com.dicoding.moviecat.ui.movie

import com.dicoding.moviecat.data.MovieEntity

interface MovieFragmentCallback {

    fun onShareClicked(movie: MovieEntity)
}