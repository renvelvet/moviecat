package com.dicoding.moviecat.data

data class MovieEntity(
    var movieId: Int,
    var title: String,
    var description: String,
    var year: String,
    var duration: String,
    var actress: String,
    var genres: String,
    var imageCover: String,
    var imageLogo: String,
    var imageList: String,
)