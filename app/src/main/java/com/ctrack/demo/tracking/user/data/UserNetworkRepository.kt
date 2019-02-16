package com.ctrack.demo.tracking.user.data

import android.content.Context
import com.ctrack.demo.tracking.common.data.entity.User
import com.ctrack.demo.tracking.common.network.NetworkRequest
import com.ctrack.demo.tracking.common.network.Response
import com.ctrack.demo.tracking.common.network.ResponseHandler
import io.reactivex.Observable

class UserNetworkRepository(val context: Context) {

    private var networkRequest: NetworkRequest = NetworkRequest(context)

    fun loadAllUsers(): Observable<List<User>> {
        return Observable.create { e ->
            networkRequest.loadAllUsers(object : ResponseHandler<List<User>> {
                override fun onReceive(response: Response<List<User>>) {
                    e.onNext(response.data!!)
                    e.onComplete()
                }
            })
        }
    }

}