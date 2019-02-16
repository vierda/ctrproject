package com.ctrack.demo.tracking.user.presentation.view.viewholder

import android.support.v7.widget.RecyclerView
import android.view.View
import com.ctrack.demo.tracking.user.data.model.UserEntity
import com.ctrack.demo.tracking.user.presentation.view.UserDataView
import kotlinx.android.synthetic.main.item_user_detail.view.*

class UserViewHolder(val view: View, val dataView: UserDataView) : RecyclerView.ViewHolder(view) {

    fun bindData(entity: UserEntity) {
        view.name.text = entity.name
        view.street_suite.text = entity.streetSuite
        view.city_zipcode.text = entity.cityZipCode
        view.company.text = entity.company

        view.container.setOnClickListener(View.OnClickListener { v ->
            dataView.onUserClick(entity.id)
        })
    }

}