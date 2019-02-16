package com.ctrack.demo.tracking.user.data

import android.content.Context
import com.ctrack.demo.tracking.common.data.entity.User
import com.ctrack.demo.tracking.common.util.DefaultSubscriber
import com.ctrack.demo.tracking.common.util.UseCase
import com.ctrack.demo.tracking.user.data.model.UserEntity

class UserUseCase(val context: Context) : UseCase() {

    private var repository: UserRepository = UserRepository(context)

    fun loadAllUsers(subscriber: DefaultSubscriber<Int>) {
        execute(repository.loadAllUsers(), subscriber)
    }

    fun loadSomeUsersFromDb(start: Int, end: Int, subscriber: DefaultSubscriber<List<UserEntity>>) {
        execute(repository.loadSomeUserFromDb(start, end), subscriber)
    }
}