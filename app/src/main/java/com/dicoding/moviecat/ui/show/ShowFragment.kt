package com.dicoding.moviecat.ui.show

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.moviecat.R
import com.dicoding.moviecat.data.ShowEntity
import com.dicoding.moviecat.databinding.FragmentShowBinding

class ShowFragment : Fragment(), ShowFragmentCallback {

    private lateinit var fragmentShowBinding: FragmentShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentShowBinding = FragmentShowBinding.inflate(layoutInflater, container, false)
        return fragmentShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[ShowViewModel::class.java]
            val shows = viewModel.getShows()

            val showAdapter = ShowAdapter(this)
            showAdapter.setList(shows)

            with(fragmentShowBinding.rvShows) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = showAdapter
            }
        }
    }

    override fun onShareClicked(show: ShowEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Let others know!!")
                .setText(resources.getString(R.string.share_text, show.title))
                .startChooser()
        }
    }
}