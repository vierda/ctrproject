package com.ctrack.demo.tracking.user.presentation.view

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ctrack.demo.tracking.R
import com.ctrack.demo.tracking.location.presentation.view.MapActivity
import com.ctrack.demo.tracking.user.data.model.UserEntity
import com.ctrack.demo.tracking.user.presentation.view.adapter.UserAdapter
import com.ctrack.demo.tracking.user.presentation.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_list_user.*


class UserActivity : AppCompatActivity(), UserDataView {

    private lateinit var adapter: UserAdapter
    private var totalRecords = 0
    private var start = 0
    private var end = 5
    private var listUser = ArrayList<UserEntity>()

    private lateinit var userViewModel: UserViewModel
    private lateinit var loadAllUsersLiveData: LiveData<Int>
    private lateinit var loadSomeUsersLiveData: LiveData<List<UserEntity>>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_user)

        adapter = UserAdapter(this)
        user_recycler_view.adapter = adapter
        user_recycler_view.layoutManager = LinearLayoutManager(this)
        user_recycler_view.addItemDecoration(DividerItemDecoration(this, 0))

        user_recycler_view.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {

                do {
                    start = end + 1
                    end = end + 5

                    if (end > totalRecords) break

                    user_progress.visibility = View.VISIBLE
                    userViewModel.loadSomeData(start, end)

                } while (false)

            }
        })


        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        userViewModel.setUserDataView(this)

        loadAllUsersLiveData = userViewModel.getLoadUserLiveData()
        loadSomeUsersLiveData = userViewModel.getLoadSomeUserLiveData()

        userViewModel.loadDataFromNetwork()
        observeLoadAllData()
    }


    private fun observeLoadAllData() {
        loadAllUsersLiveData.observe(this, Observer<Int> {
            totalRecords = it!!
            userViewModel.loadSomeData(start, end)
            observeSomeData()

        })
    }


    private fun observeSomeData() {
        loadSomeUsersLiveData.observe(this, Observer<List<UserEntity>> { t ->

            Handler().postDelayed(Runnable {
                if (t!!.isNotEmpty()) {
                    listUser.addAll(t!!)
                    adapter.setListUser(listUser)
                    adapter.notifyDataSetChanged()
                }

                if (user_progress.visibility == View.VISIBLE)
                    user_progress.visibility = View.GONE

            }, 500)


        })
    }

    override fun onUserClick(id: Int) {
        val myIntent = Intent(this, MapActivity::class.java)
        myIntent.putExtra(MapActivity.USER_ID, id)
        startActivity(myIntent)
    }

}