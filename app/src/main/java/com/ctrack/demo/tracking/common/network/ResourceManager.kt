package com.ctrack.demo.tracking.common.network

class ResourceManager {

    private val protocol = "https"
    private val serverName = "jsonplaceholder.typicode.com"


    fun getHost(): String {
        val builder = StringBuilder(1024)

        builder.append(protocol)
                .append("://")
                .append(serverName)

        return builder.toString()
    }


    fun getListUser(): String {
        return this.getHost() + "/users"
    }

}