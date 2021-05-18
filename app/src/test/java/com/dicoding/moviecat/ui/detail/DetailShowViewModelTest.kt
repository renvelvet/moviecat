package com.dicoding.moviecat.ui.detail

import com.dicoding.moviecat.utils.DataDummy
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailShowViewModelTest {

    private lateinit var viewModel: DetailShowViewModel
    private val id = 7
    private val dummyShow = DataDummy.generateDummyShows()[id]

    @Before
    fun setUp() {
        viewModel = DetailShowViewModel()
        viewModel.setSelectedShow(id)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectedShow(dummyShow.showId)
        val showEntity = viewModel.getShow()
        assertNotNull(showEntity)
        assertEquals(dummyShow.showId, showEntity.showId)
        assertEquals(dummyShow.title, showEntity.title)
        assertEquals(dummyShow.year, showEntity.year)
        assertEquals(dummyShow.episode, showEntity.episode)
        assertEquals(dummyShow.description, showEntity.description)
        assertEquals(dummyShow.genres, showEntity.genres)
        assertEquals(dummyShow.actress, showEntity.actress)
        assertEquals(dummyShow.imageList, showEntity.imageList)
        assertEquals(dummyShow.imageCover, showEntity.imageCover)
        assertEquals(dummyShow.imageLogo, showEntity.imageLogo)
    }
}