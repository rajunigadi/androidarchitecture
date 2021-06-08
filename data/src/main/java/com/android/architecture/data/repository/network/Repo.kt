package com.android.architecture.data.repository.network

import io.reactivex.Single

interface Repo {
    fun users(): Single<MutableList<User>>
    fun userItem(login: String): Single<User>
}