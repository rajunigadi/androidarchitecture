package com.android.architecture.di.module;

import com.android.architecture.data.repository.network.Api;
import com.android.architecture.data.repository.network.Repo;
import com.android.architecture.data.repository.network.RepoImpl;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/android/architecture/di/module/RepoModule;", "", "()V", "provideRepo", "Lcom/android/architecture/data/repository/network/Repo;", "api", "Lcom/android/architecture/data/repository/network/Api;", "app_debug"})
@dagger.Module()
public final class RepoModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.architecture.data.repository.network.Repo provideRepo(@org.jetbrains.annotations.NotNull()
    com.android.architecture.data.repository.network.Api api) {
        return null;
    }
    
    public RepoModule() {
        super();
    }
}