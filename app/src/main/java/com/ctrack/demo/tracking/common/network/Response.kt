package com.ctrack.demo.tracking.common.network

class Response<T> {

    var responseCode: Int = 0
    var  data: T? = null
    var errorDescription: String? = null
}
