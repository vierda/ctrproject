package com.ctrack.demo.tracking.login.data

import com.ctrack.demo.tracking.common.util.DefaultSubscriber
import com.ctrack.demo.tracking.common.util.UseCase


class LoginUseCase : UseCase() {

    private var repository: LoginRepository = LoginRepository()

    fun populateData(subscriber: DefaultSubscriber<Boolean>) {
        execute(repository.populateData(), subscriber)
    }

    fun getAuthenticatedUser(username: String, password: String, subscriber: DefaultSubscriber<Boolean>) {
        execute(repository.getAuthenticatedUser(username, password), subscriber)
    }
}