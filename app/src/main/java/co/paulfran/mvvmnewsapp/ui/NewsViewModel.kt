package co.paulfran.mvvmnewsapp.ui

import androidx.lifecycle.ViewModel
import co.paulfran.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}