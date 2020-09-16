package co.paulfran.mvvmnewsapp.models

import co.paulfran.mvvmnewsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)