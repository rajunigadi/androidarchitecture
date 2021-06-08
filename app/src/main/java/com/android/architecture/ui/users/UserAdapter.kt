package com.android.architecture.ui.users

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.android.architecture.R
import com.android.architecture.common.RecycleViewItemClickListener
import com.android.architecture.data.repository.network.User
import com.android.architecture.databinding.UserItemBinding
import com.android.architecture.ui.base.BaseRecyclerViewAdapter
import javax.inject.Inject

class UserAdapter @Inject constructor(val requestManager: RequestManager): BaseRecyclerViewAdapter<RecyclerView.ViewHolder>() {

    private var listener: RecycleViewItemClickListener<User>? = null
    private var items: MutableList<User> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(parent.getViewBinding(R.layout.user_item))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as UserViewHolder).bind(items[position])
        listener?.let {
            holder.itemRowBinding.itemClickListener = it
        }
    }

    override fun getItemCount(): Int = items.size

    fun setItems(newItems: List<User>) {
        items.clear()
        items.addAll(newItems)
        if (attachedToRecyclerView) {
            notifyDataSetChanged()
        }
    }

    fun setOnClickListener(itemClickListener: RecycleViewItemClickListener<User>?) {
        itemClickListener?.let {
            this.listener = it
        }
    }

    internal inner class UserViewHolder(itemRowBinding: UserItemBinding) :
        RecyclerView.ViewHolder(itemRowBinding.root) {

        var itemRowBinding: UserItemBinding = itemRowBinding

        fun bind(item: User) {
            itemRowBinding.item = item
            item.avatarUrl?.let { imageUrl ->
                requestManager
                    .load(imageUrl)
                    .into(itemRowBinding.ivAvatar)
            }
        }
    }
}