package com.ctrack.demo.tracking.common.network


class NetworkException : Exception {

    val BAD_REQUEST = 404
    val SERVER_ERROR = 500

    private var errorCode = -1
    override var message = ""

    constructor (errorCode: Int, message: String) {
        this.message = message
        this.errorCode = errorCode
    }

    constructor (errorCode: Int) {
        this.errorCode = errorCode
    }

    fun getErrorCode(): Int {
        return errorCode
    }

    fun getErrorMessage(): String {
        return message
    }
}