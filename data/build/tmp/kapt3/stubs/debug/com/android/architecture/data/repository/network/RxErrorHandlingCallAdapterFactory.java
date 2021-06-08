package com.android.architecture.data.repository.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096\u0002\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/architecture/data/repository/network/RxErrorHandlingCallAdapterFactory;", "Lretrofit2/CallAdapter$Factory;", "()V", "original", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "get", "Lretrofit2/CallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/CallAdapter;", "Companion", "RxCallAdapterWrapper", "data_debug"})
public final class RxErrorHandlingCallAdapterFactory extends retrofit2.CallAdapter.Factory {
    private final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory original = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.architecture.data.repository.network.RxErrorHandlingCallAdapterFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public retrofit2.CallAdapter<?, ?> get(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type returnType, @org.jetbrains.annotations.NotNull()
    java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private RxErrorHandlingCallAdapterFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/android/architecture/data/repository/network/RxErrorHandlingCallAdapterFactory$RxCallAdapterWrapper;", "R", "Lretrofit2/CallAdapter;", "", "retrofit", "Lretrofit2/Retrofit;", "wrapped", "(Lretrofit2/Retrofit;Lretrofit2/CallAdapter;)V", "adapt", "call", "Lretrofit2/Call;", "asRetrofitException", "Lcom/android/architecture/data/repository/network/exceptions/ServerException;", "throwable", "", "responseType", "Ljava/lang/reflect/Type;", "data_debug"})
    static final class RxCallAdapterWrapper<R extends java.lang.Object> implements retrofit2.CallAdapter<R, java.lang.Object> {
        private final retrofit2.Retrofit retrofit = null;
        private final retrofit2.CallAdapter<R, ?> wrapped = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.reflect.Type responseType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Object adapt(@org.jetbrains.annotations.NotNull()
        retrofit2.Call<R> call) {
            return null;
        }
        
        private final com.android.architecture.data.repository.network.exceptions.ServerException asRetrofitException(java.lang.Throwable throwable) {
            return null;
        }
        
        public RxCallAdapterWrapper(@org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
        retrofit2.CallAdapter<R, ?> wrapped) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/android/architecture/data/repository/network/RxErrorHandlingCallAdapterFactory$Companion;", "", "()V", "create", "Lretrofit2/CallAdapter$Factory;", "data_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.CallAdapter.Factory create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}