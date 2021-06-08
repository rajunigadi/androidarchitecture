package com.android.architecture.di.module

import com.android.architecture.data.repository.network.Api
import com.android.architecture.data.repository.network.Repo
import com.android.architecture.data.repository.network.RepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepoModule {

    @Provides
    @Singleton
    fun provideRepo(api: Api): Repo = RepoImpl(api)
}