package com.android.architecture.data.repository.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

const val USERS = "users"
const val USER_ITEM = "users/{login}"

interface Api {

    @GET(USERS)
    fun users(): Single<MutableList<User>>

    @GET(USER_ITEM)
    fun userItem(@Path("login") login: String): Single<User>
}