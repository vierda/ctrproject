package com.ctrack.demo.tracking.common.network

import android.text.TextUtils
import android.util.Log
import com.android.volley.*
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.HttpHeaderParser
import com.ctrack.demo.tracking.common.util.Util
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.io.StringReader
import java.io.UnsupportedEncodingException
import java.nio.charset.Charset
import java.util.*

class JsonRequest<T> : Request<T> {
    private var jsonResponse: JsonObject? = null
    private var responseCode: Int = 0

    private var mListener: Response.Listener<T>? = null
    private var mJsonResponseListener: JsonResponseListener<T>? = null
    private var mRequestBody: String? = null

    private val mType: Class<T>?
    private var mContentType: String? = null
    private var mJSessionId: String? = null
    private var requestHeaders: Map<String, String>? = null

    private var nwResponse: NetworkResponse? = null

    private val gson = Util.gson


    constructor(url: String, requestBody: String, listener: Response.Listener<T>,
                errorListener: Response.ErrorListener) : this(Request.Method.DEPRECATED_GET_OR_POST, url, requestBody, listener, errorListener, null, null) {
    }


    constructor(method: Int, url: String, requestBody: String, listener: Response.Listener<T>,
                errorListener: Response.ErrorListener, pJSessionId: String?, type: Class<T>?) : super(method, url, errorListener) {

        mListener = listener
        mRequestBody = requestBody
        mJSessionId = pJSessionId
        mType = type
    }


    constructor(method: Int, url: String, requestBody: String?, listener: JsonResponseListener<T>,
                errorListener: Response.ErrorListener, pJSessionId: String?, type: Class<T>) : super(method, url, errorListener) {

        mJsonResponseListener = listener
        mRequestBody = requestBody
        mJSessionId = pJSessionId
        mType = type
    }

    /**
     * Deliver received response to specified listener.
     *
     * @param response
     * T response object.
     */
    override fun deliverResponse(response: T) {
        do {
            if (mListener != null) {
                mListener!!.onResponse(response)
                break
            }

            if (mJsonResponseListener != null) {
                mJsonResponseListener!!.onResponse(response, jsonResponse!!, responseCode,
                        if (nwResponse != null) nwResponse!!.headers else null)
                break
            }
        } while (false)
    }


    override fun parseNetworkResponse(response: NetworkResponse): Response<T> {
        try {
            nwResponse = response

            val resultString = String(response.data, Charset.forName(HttpHeaderParser.parseCharset(response.headers)))

            Log.d("RESULT STRING: ", resultString)

            responseCode = response.statusCode

            jsonResponse = JsonObject()

            val jsonParser = JsonParser()
            var element: JsonElement? = jsonParser.parse(StringReader(resultString))
            if (element == null)
                element = jsonParser.parse(resultString)

            if (element != null)
                jsonResponse!!.add("response", element)

            val result = gson.fromJson(resultString, mType!!)
            return Response.success(result, HttpHeaderParser.parseCacheHeaders(response))
        } catch (e: Throwable) {
            e.printStackTrace()

            return Response.error(ParseError(response))
        }

    }


    override fun getBodyContentType(): String {
        return if (TextUtils.isEmpty(mContentType)) PROTOCOL_CONTENT_TYPE else mContentType!!
    }


    fun setBodyContentType(pContentType: String) {
        mContentType = pContentType
    }

    override fun getBody(): ByteArray? {
        try {
            return mRequestBody?.toByteArray(charset(PROTOCOL_CHARSET))
        } catch (uee: UnsupportedEncodingException) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s",
                    mRequestBody, PROTOCOL_CHARSET)
            return null
        }

    }


    @Throws(AuthFailureError::class)
    override fun getHeaders(): Map<String, String> {
        val headers = HashMap<String, String>()

        do {

            headers.putAll(super.getHeaders())

            if (requestHeaders != null && !requestHeaders!!.isEmpty()) {
                headers.putAll(requestHeaders!!)
                break
            }

            if (TextUtils.isEmpty(mJSessionId)) break

            //headers.put("Cookie", Constants.JSESSIONID + "=" + mJSessionId);
        } while (false)

        return headers
    }

    /**
     * Sets map header.
     *
     * @param headers
     * the map header
     */
    fun setRequestHeaders(headers: Map<String, String>) {
        requestHeaders = headers
    }

    companion object {

        private val PROTOCOL_CHARSET = "utf-8"
        private val PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", PROTOCOL_CHARSET)
    }
}