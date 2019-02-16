package com.ctrack.demo.tracking.common.network

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.ctrack.demo.tracking.common.data.entity.User
import com.ctrack.demo.tracking.common.util.Util
import com.google.gson.JsonArray
import com.google.gson.JsonObject

class NetworkRequest(context: Context) {


    private val TAG = NetworkRequest::class.java.canonicalName
    private val resourceManager = ResourceManager()

    init {
        VolleyHelper.init(context)
    }

    fun loadAllUsers(rListener: ResponseHandler<List<User>>) {
        val url = resourceManager.getListUser()
        val listener = object : JsonResponseListener<JsonArray> {
            override fun onResponse(response: JsonArray, pJsonObject: JsonObject, responseCode: Int, responseHeaders: Map<String, String>?) {
                val users = Util.gson.fromJson(response, Array<User>::class.java).toList()
                sendMessage<List<User>>(users, responseCode, rListener)
            }
        }

        val jsonRequest = JsonRequest(Request.Method.GET, url, null, listener,
                sendError(rListener), null, JsonArray::class.java)

        VolleyHelper.exec(jsonRequest)
    }

    private fun <T> sendMessage(`object`: T, responseCode: Int, listener: ResponseHandler<T>) {

        val response = Response<T>()
        response.data = `object`
        response.responseCode = responseCode
        listener.onReceive(response)
    }

    private fun <T> sendError(listener: ResponseHandler<T>): com.android.volley.Response.ErrorListener {
        return com.android.volley.Response.ErrorListener { error ->
            if (listener == null) {
                Log.e(TAG, "Unknown error - Application callback listener is null!")
            } else {

                val response = Response<T>()
                if (error != null && error.networkResponse != null) {
                    response.responseCode = error.networkResponse.statusCode
                    response.errorDescription = error.message
                }

                listener!!.onReceive(response)
            }
        }
    }

}