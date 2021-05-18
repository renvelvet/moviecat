package com.dicoding.moviecat.ui.show

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.moviecat.R
import com.dicoding.moviecat.data.ShowEntity
import com.dicoding.moviecat.databinding.RvItemsBinding
import com.dicoding.moviecat.ui.detail.DetailShowActivity

class ShowAdapter(private val callback: ShowFragmentCallback) :
    RecyclerView.Adapter<ShowAdapter.ShowViewHolder>() {

    private var listShows = ArrayList<ShowEntity>()

    fun setList(shows: List<ShowEntity>?) {
        if (shows == null) return
        this.listShows.clear()
        this.listShows.addAll(shows)
    }

    inner class ShowViewHolder(private val binding: RvItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(showEntity: ShowEntity) {
            with(binding) {
                tvTitle.text = showEntity.title
                tvYear.text = showEntity.year
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailShowActivity::class.java)
                    intent.putExtra(DetailShowActivity.EXTRA_ID, showEntity.showId)
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener { callback.onShareClicked(showEntity) }
                Glide.with(itemView.context)
                    .load(showEntity.imageList)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imgPoster)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShowViewHolder {
        val itemsBinding =
            RvItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowViewHolder(itemsBinding)
    }

    override fun onBindViewHolder(holder: ShowViewHolder, position: Int) {
        val show = listShows[position]
        holder.bind(show)
    }

    override fun getItemCount(): Int = listShows.size
}