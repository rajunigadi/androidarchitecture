package com.android.architecture.data.repository.network

import io.reactivex.Single

class RepoImpl(private val api: Api) : Repo {
    override fun users(): Single<MutableList<User>> = api.users()
    override fun userItem(login: String): Single<User> = api.userItem(login)
}
