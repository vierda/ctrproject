package com.ctrack.demo.tracking.login.presentation.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.ctrack.demo.tracking.login.data.LoginUseCase
import com.ctrack.demo.tracking.common.util.DefaultSubscriber

class LoginViewModel(application: Application) : AndroidViewModel(application) {


    private var TAG = LoginViewModel::class.java.simpleName
    private var useCase: LoginUseCase = LoginUseCase()
    private var loginLiveData: MutableLiveData<Boolean> = MutableLiveData()


    fun getLoginLiveData(): MutableLiveData<Boolean> {
        return loginLiveData
    }

    fun populateData() {
        useCase.populateData(object : DefaultSubscriber<Boolean>() {
            override fun onError(t: Throwable?) {
                Log.e(TAG, "Error populate data")
            }

            override fun onNext(t: Boolean) {
                Log.i(TAG, "populate data ok")
            }
        })
    }

    fun getAuthenticatedUser(username: String, password: String) {
        useCase.getAuthenticatedUser(username, password, object : DefaultSubscriber<Boolean>() {

            override fun onError(t: Throwable?) {
                loginLiveData.postValue(false)
            }

            override fun onNext(isAuthenticated: Boolean) {
                loginLiveData.postValue(isAuthenticated)
            }

        })
    }
}