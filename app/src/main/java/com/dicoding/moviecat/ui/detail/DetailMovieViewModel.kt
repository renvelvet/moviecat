package com.dicoding.moviecat.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.moviecat.data.MovieEntity
import com.dicoding.moviecat.utils.DataDummy
import kotlin.properties.Delegates

class DetailMovieViewModel : ViewModel() {
    private var movieId by Delegates.notNull<Int>()

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun getMovie() : MovieEntity {
        lateinit var movie: MovieEntity
        val movieEntities = DataDummy.generateDummyMovies()
        for (entity in movieEntities) {
            if (entity.movieId == movieId) {
                movie = entity
            }
        }
        return movie
    }
}