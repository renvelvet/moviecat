package com.dicoding.moviecat.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.moviecat.R
import com.dicoding.moviecat.data.ShowEntity
import com.dicoding.moviecat.databinding.ActivityDetailShowBinding
import com.dicoding.moviecat.databinding.ContentDetailBinding

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

        binding.toolbar.title = ""
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailShowViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val id = extras.getInt(EXTRA_ID)
            viewModel.setSelectedShow(id)
            populateShow(viewModel.getShow())
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