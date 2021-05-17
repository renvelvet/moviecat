package com.dicoding.moviecat.data

data class ShowEntity(
    var showId: Int,
    var title: String,
    var description: String,
    var year: String,
    var episode: String,
    var actress: String,
    var genres: String,
    var imageCover: String,
    var imageLogo: String,
    var imageList: String,
)
