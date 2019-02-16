package com.ctrack.demo.tracking.common.network

import com.google.gson.JsonObject


open interface JsonResponseListener<T> {

    fun onResponse(response: T, pJsonObject: JsonObject, responseCode: Int, responseHeaders: Map<String, String>?)

}