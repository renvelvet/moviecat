package com.dicoding.moviecat.ui.show

import com.dicoding.moviecat.data.ShowEntity

interface ShowFragmentCallback {

    fun onShareClicked(show: ShowEntity)
}