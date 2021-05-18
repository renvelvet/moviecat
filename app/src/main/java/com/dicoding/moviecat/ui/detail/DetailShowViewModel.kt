package com.dicoding.moviecat.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.moviecat.data.ShowEntity
import com.dicoding.moviecat.utils.DataDummy
import kotlin.properties.Delegates

class DetailShowViewModel : ViewModel() {

    private var showId by Delegates.notNull<Int>()

    fun setSelectedShow(showId: Int) {
        this.showId = showId
    }

    fun getShow(): ShowEntity {
        lateinit var show: ShowEntity
        val showEntities = DataDummy.generateDummyShows()
        for (entity in showEntities) {
            if (entity.showId == showId) {
                show = entity
            }
        }
        return show
    }
}