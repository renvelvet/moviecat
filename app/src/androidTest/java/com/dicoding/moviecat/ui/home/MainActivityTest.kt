package com.dicoding.moviecat.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.moviecat.R
import com.dicoding.moviecat.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val dummyMovieEntity = DataDummy.generateDummyMovies()
    private val dummyShowEntity = DataDummy.generateDummyShows()

    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovieFragment() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovieEntity.size
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movies)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.cover_image)).check(matches(isDisplayed()))
        onView(withId(R.id.img_title_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_additional_information_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_additional_information_movie)).check(matches(withText(dummyMovieEntity[0].duration)))
        onView(withId(R.id.tv_year_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_year_movie)).check(matches(withText(dummyMovieEntity[0].year)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText(dummyMovieEntity[0].description)))
        onView(withId(R.id.tv_cast)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_cast)).check(matches(withText(dummyMovieEntity[0].actress)))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyMovieEntity[0].genres)))
    }

    @Test
    fun loadShowFragment() {
        onView(withText("TV Shows")).perform(click())
        onView(withId(R.id.rv_shows)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_shows)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyShowEntity.size
            )
        )
    }

    @Test
    fun loadDetailShow() {
        onView(withText("TV Shows")).perform(click())
        onView(withId(R.id.rv_shows)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.cover_image)).check(matches(isDisplayed()))
        onView(withId(R.id.img_title_show)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_additional_information_show)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_additional_information_show)).check(matches(withText(dummyShowEntity[0].episode)))
        onView(withId(R.id.tv_year_show)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_year_show)).check(matches(withText(dummyShowEntity[0].year)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText(dummyShowEntity[0].description)))
        onView(withId(R.id.tv_cast)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_cast)).check(matches(withText(dummyShowEntity[0].actress)))
        onView(withId(R.id.tv_genre)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre)).check(matches(withText(dummyShowEntity[0].genres)))
    }

}