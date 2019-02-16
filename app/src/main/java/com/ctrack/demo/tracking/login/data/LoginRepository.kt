package com.ctrack.demo.tracking.login.data

import io.reactivex.Observable

class LoginRepository {

    private var loginDatabaseRepositoy: LoginDatabaseRepository = LoginDatabaseRepository()

    fun populateData () : Observable<Boolean> {
        return loginDatabaseRepositoy.populateData()
    }

    fun getAuthenticatedUser(username: String, password: String): Observable<Boolean> {
        return loginDatabaseRepositoy.getAuthenticatedUser(username, password)
    }
}