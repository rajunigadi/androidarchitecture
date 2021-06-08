package com.android.architecture.di.module

import com.android.architecture.data.utils.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class BaseUrlModule {

    @Provides
    @Singleton
    fun provideUrl(): String = BASE_URL
}