package com.balsa.imagesearchapp.api

import com.balsa.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)