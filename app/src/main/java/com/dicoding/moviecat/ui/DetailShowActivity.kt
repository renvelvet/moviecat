package com.dicoding.moviecat.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.moviecat.R
import com.dicoding.moviecat.data.ShowEntity
import com.dicoding.moviecat.databinding.ActivityDetailShowBinding
import com.dicoding.moviecat.databinding.ContentDetailBinding
import com.dicoding.moviecat.utils.DataDummy

class DetailShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailShowBinding
    private lateinit var contentBinding: ContentDetailBinding

    companion object {
        const val EXTRA_ID = "id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailShowBinding.inflate(layoutInflater)
        contentBinding = binding.contentDetail
        setContentView(binding.root)

        binding.toolbar.setTitle("")
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras
        if (extras != null) {
            val id = extras.getInt(EXTRA_ID)
            for (show in DataDummy.generateDummyShows()) {
                if (show.showId == id) {
                    populateShow(show)
                }
            }
        }
    }

    private fun populateShow(entity: ShowEntity) {
        contentBinding.apply {
            Glide.with(this@DetailShowActivity)
                .load(entity.imageCover)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(coverImage)

            Glide.with(this@DetailShowActivity)
                .load(entity.imageLogo)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error)
                )
                .into(imgTitle)

            tvYear.text = entity.year
            tvAdditionalInformation.text = entity.episode
            tvDescription.text = entity.description
            tvCast.text = entity.actress
            tvGenre.text = entity.genres
        }
    }
}