package com.dicoding.moviecat.ui

import androidx.lifecycle.ViewModel
import com.dicoding.moviecat.data.ShowEntity
import com.dicoding.moviecat.utils.DataDummy

class ShowViewModel : ViewModel() {

    fun getShows(): List<ShowEntity> = DataDummy.generateDummyShows()
}