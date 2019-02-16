package com.ctrack.demo.tracking.common.network

open interface ResponseHandler<T> {

    fun onReceive(response: Response<T>)
}