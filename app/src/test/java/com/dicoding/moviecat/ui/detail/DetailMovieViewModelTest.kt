package com.dicoding.moviecat.ui.detail

import com.dicoding.moviecat.utils.DataDummy
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailMovieViewModelTest {

    private lateinit var viewModel: DetailMovieViewModel
    private val id = 7
    private val dummyMovie = DataDummy.generateDummyMovies()[id]

    @Before
    fun setUp() {
        viewModel = DetailMovieViewModel()
        viewModel.setSelectedMovie(id)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.genres, movieEntity.genres)
        assertEquals(dummyMovie.actress, movieEntity.actress)
        assertEquals(dummyMovie.imageList, movieEntity.imageList)
        assertEquals(dummyMovie.imageCover, movieEntity.imageCover)
        assertEquals(dummyMovie.imageLogo, movieEntity.imageLogo)
    }
}