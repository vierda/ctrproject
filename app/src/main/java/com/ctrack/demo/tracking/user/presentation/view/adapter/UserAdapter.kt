package com.ctrack.demo.tracking.user.presentation.view.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ctrack.demo.tracking.R
import com.ctrack.demo.tracking.user.data.model.UserEntity
import com.ctrack.demo.tracking.user.presentation.view.UserDataView
import com.ctrack.demo.tracking.user.presentation.view.viewholder.UserViewHolder


class UserAdapter(val dataView: UserDataView) : RecyclerView.Adapter<UserViewHolder>() {

    private var listUser = ArrayList<UserEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user_detail, null), dataView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindData(listUser[position])
    }

    override fun getItemCount(): Int {
        if (listUser != null)
            return listUser.size
        else
            return 0
    }

    fun setListUser(list: ArrayList<UserEntity>) {
        if (!listUser.isEmpty()) listUser.clear()
        listUser.addAll(list)
    }
}