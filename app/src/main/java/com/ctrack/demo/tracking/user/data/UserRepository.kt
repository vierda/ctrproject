package com.ctrack.demo.tracking.user.data

import android.content.Context
import com.ctrack.demo.tracking.common.data.entity.User
import com.ctrack.demo.tracking.user.data.model.UserEntity
import io.reactivex.Observable

class UserRepository(val context: Context) {

    private var databaseRepository = UserDatabaseRepository()
    private var networkRepository = UserNetworkRepository(context)

    fun loadAllUsers(): Observable<Int> {
        return networkRepository.loadAllUsers().concatMap { t: List<User> ->
            databaseRepository.saveUserData(t)
        }
    }

    fun loadSomeUserFromDb(start: Int, end: Int): Observable<List<UserEntity>> {
        return databaseRepository.loadUser(start, end)
    }
}