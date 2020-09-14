package co.paulfran.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import co.paulfran.mvvmnewsapp.R
import co.paulfran.mvvmnewsapp.ui.NewsActivity

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: ViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }
}