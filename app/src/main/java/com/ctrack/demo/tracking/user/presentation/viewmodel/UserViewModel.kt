package com.ctrack.demo.tracking.user.presentation.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.ctrack.demo.tracking.common.data.entity.User
import com.ctrack.demo.tracking.common.util.DefaultSubscriber
import com.ctrack.demo.tracking.user.data.UserUseCase
import com.ctrack.demo.tracking.user.data.model.UserEntity
import com.ctrack.demo.tracking.user.presentation.view.UserDataView


class UserViewModel(application: Application) : AndroidViewModel(application) {

    private var TAG = UserViewModel::class.java.simpleName
    private var useCase: UserUseCase = UserUseCase(application.baseContext)
    private var loadUserLiveData: MutableLiveData<Int> = MutableLiveData()
    private var loadSomeUserLiveData: MutableLiveData<List<UserEntity>> = MutableLiveData()
    private lateinit var dataView: UserDataView

    fun setUserDataView(dataView: UserDataView) {
        this.dataView = dataView
    }

    fun getLoadUserLiveData(): MutableLiveData<Int> {
        return loadUserLiveData
    }

    fun getLoadSomeUserLiveData(): MutableLiveData<List<UserEntity>> {
        return loadSomeUserLiveData
    }

    fun loadDataFromNetwork() {
        useCase.loadAllUsers(object : DefaultSubscriber<Int>() {

            override fun onError(t: Throwable?) {
                Log.e(TAG, "Error load user data from network")
            }

            override fun onNext(t: Int) {
                loadUserLiveData.postValue(t)
            }

        })
    }

    fun loadSomeData(start: Int, end: Int) {
        useCase.loadSomeUsersFromDb(start, end, object : DefaultSubscriber<List<UserEntity>>() {
            override fun onError(t: Throwable?) {
                Log.e(TAG, "Error load some user data from network")
            }

            override fun onNext(t: List<UserEntity>) {
                loadSomeUserLiveData.postValue(t)
            }
        })
    }
}