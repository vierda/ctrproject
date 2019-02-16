package com.ctrack.demo.tracking.common.network

import android.content.Context
import com.android.volley.DefaultRetryPolicy
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.RetryPolicy
import com.android.volley.toolbox.Volley


object VolleyHelper {

    private var sRequestQueue: RequestQueue? = null
    private val REQUEST_TIMEOUT = 60


    fun init(context: Context) {
        sRequestQueue = Volley.newRequestQueue(context, null)
    }


    fun <T>exec(request: Request<T>) {
        request.retryPolicy = createCustomRetryPolicy(REQUEST_TIMEOUT)
        sRequestQueue!!.add<T>(request)
    }


    fun <T>exec(request: Request<T>, timeout: Int?) {
        var timeout = timeout
        if (timeout == null) timeout = REQUEST_TIMEOUT

        request.retryPolicy = createCustomRetryPolicy(timeout)

        sRequestQueue!!.add<T>(request)
    }

    fun cancelAll(tag: Any) {
        sRequestQueue!!.cancelAll(tag)
    }


    private fun createCustomRetryPolicy(timeout: Int): RetryPolicy {
        return DefaultRetryPolicy(timeout * 1000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT)
    }
}