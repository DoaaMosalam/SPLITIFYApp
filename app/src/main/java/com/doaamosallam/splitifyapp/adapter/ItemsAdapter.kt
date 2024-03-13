package com.doaamosallam.splitifyapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.doaamosallam.splitifyapp.R
import com.doaamosallam.splitifyapp.databinding.RecyclerViewItemBinding
import com.doaamosallam.splitifyapp.model.Items

class ItemsAdapter(private val itemList: List<Items>):RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        return ItemsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        )
    }

    override fun getItemCount():Int = itemList.size


    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind(itemList[position])
    }


    inner class ItemsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val binding = RecyclerViewItemBinding.bind(itemView)
        fun bind(items: Items){
            binding.apply {
                txtDate.text = items.date
                txtItem.text = items.item
                txtPrice.text = items.price
                txtPaidBy.text = items.paidBy

            }
        }
    }

}