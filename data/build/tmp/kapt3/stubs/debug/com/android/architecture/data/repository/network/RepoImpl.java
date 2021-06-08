package com.android.architecture.data.repository.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/android/architecture/data/repository/network/RepoImpl;", "Lcom/android/architecture/data/repository/network/Repo;", "api", "Lcom/android/architecture/data/repository/network/Api;", "(Lcom/android/architecture/data/repository/network/Api;)V", "userItem", "Lio/reactivex/Single;", "Lcom/android/architecture/data/repository/network/User;", "login", "", "users", "", "data_debug"})
public final class RepoImpl implements com.android.architecture.data.repository.network.Repo {
    private final com.android.architecture.data.repository.network.Api api = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.android.architecture.data.repository.network.User>> users() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.android.architecture.data.repository.network.User> userItem(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
    
    public RepoImpl(@org.jetbrains.annotations.NotNull()
    com.android.architecture.data.repository.network.Api api) {
        super();
    }
}