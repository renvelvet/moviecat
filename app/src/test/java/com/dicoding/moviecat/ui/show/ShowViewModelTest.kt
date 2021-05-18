package com.dicoding.moviecat.ui.show

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class ShowViewModelTest {

    private lateinit var viewModel: ShowViewModel

    @Before
    fun setUp() {
        viewModel = ShowViewModel()
    }

    @Test
    fun getShows() {
        val showEntity = viewModel.getShows()
        assertNotNull(showEntity)
        assertEquals(13, showEntity.size)
    }
}