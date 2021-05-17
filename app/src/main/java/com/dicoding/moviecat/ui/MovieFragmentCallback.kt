package com.dicoding.moviecat.ui

import com.dicoding.moviecat.data.MovieEntity

interface MovieFragmentCallback {

    fun onShareClicked(movie: MovieEntity)
}