package com.ctrack.demo.tracking.login.data

import com.ctrack.demo.tracking.TrackingApplication
import com.ctrack.demo.tracking.common.data.entity.Login
import io.reactivex.Observable
import java.util.concurrent.Executors


class LoginDatabaseRepository {

    fun getAuthenticatedUser(username: String, password: String): Observable<Boolean> {
        return Observable.unsafeCreate<Boolean> { subscriber ->
            Executors.newSingleThreadScheduledExecutor().execute(Runnable {
                val login = TrackingApplication._instance.getDatabase()
                        ?.LoginDao()?.getAuthenticationUser(username, password)
                subscriber.onNext(login != null)
            })
        }
    }

    fun populateData(): Observable<Boolean> {
        return Observable.unsafeCreate<Boolean> {
            Executors.newSingleThreadExecutor().execute(Runnable {
                val loginUsers = initDataLogin()
                TrackingApplication._instance.getDatabase()?.LoginDao()?.insertAll(loginUsers)
                it.onNext(true)
            })
        }
    }

    private fun initDataLogin(): List<Login> {
        val loginOne = Login()
        loginOne.username = "mila"
        loginOne.password = "mila"

        val loginTwo = Login()
        loginTwo.username = "jesse"
        loginTwo.password = "jesse"

        val loginThree = Login()
        loginThree.username = "boonchuan"
        loginThree.password = "boonchuan"

        return arrayListOf(loginOne, loginTwo, loginThree)

    }
}