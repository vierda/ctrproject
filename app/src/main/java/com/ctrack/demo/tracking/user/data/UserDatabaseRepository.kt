package com.ctrack.demo.tracking.user.data

import com.ctrack.demo.tracking.TrackingApplication
import com.ctrack.demo.tracking.common.data.entity.User
import com.ctrack.demo.tracking.user.data.model.UserEntity
import io.reactivex.Observable
import java.util.concurrent.Executors

class UserDatabaseRepository {

    fun saveUserData(users: List<User>): Observable<Int> {
        return Observable.unsafeCreate<Int> {
            Executors.newSingleThreadExecutor().execute(Runnable {
                TrackingApplication._instance.getDatabase()?.UserDao()?.insertAll(users)
                if (users != null)
                    it.onNext(users.size)
                else
                    it.onNext(0)
            })
        }
    }

    fun loadUser(start: Int, end: Int): Observable<List<UserEntity>> {
        return Observable.unsafeCreate<List<UserEntity>> {
            Executors.newSingleThreadExecutor().execute(Runnable {
                val users = TrackingApplication._instance.getDatabase()?.UserDao()?.loadSomeUsers(start, end)
                val userEntities = ArrayList<UserEntity>()
                users?.forEach { user: User ->
                    val entity = UserEntity()
                    entity.id = user.id
                    entity.name = user.name
                    entity.streetSuite = "${user.address.street} ${user.address.suite}"
                    entity.cityZipCode = "${user.address.city}, ${user.address.zipcode}"
                    entity.company = user.company.name
                    userEntities.add(entity)
                }
                it.onNext(userEntities)

            })
        }
    }
}