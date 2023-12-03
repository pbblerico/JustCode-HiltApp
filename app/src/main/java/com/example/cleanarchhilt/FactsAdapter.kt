package com.example.cleanarchhilt

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanarchhilt.databinding.ItemFactBinding


class FactsAdapter : ListAdapter<String, FactsAdapter.FactsViewHolder>(FactDiffUtils) {

    object FactDiffUtils : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }
    }

    inner class FactsViewHolder(private val binding: ItemFactBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String) {
            binding.fact.text = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FactsViewHolder {
        return FactsViewHolder(
            ItemFactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FactsViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}