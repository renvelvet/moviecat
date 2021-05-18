package com.dicoding.moviecat.ui.movie

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @Before
    fun setUp() {
        viewModel = MovieViewModel()
    }

    @Test
    fun getMovies() {
        val entity = viewModel.getMovies()
        assertNotNull(entity)
        assertEquals(13, entity.size)
    }
}