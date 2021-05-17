package com.dicoding.moviecat.ui

import com.dicoding.moviecat.data.ShowEntity

interface ShowFragmentCallback {

    fun onShareClicked(show: ShowEntity)
}