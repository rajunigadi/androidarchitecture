package com.android.architecture.data.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0007\u001a&\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u0001H\u0003H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0002H\u0007\u001a<\u0010\u0000\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u0001H\u0003H\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u0001H\u0003H\u0003\u0018\u00010\u00050\u0005\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0007\u001a&\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u0001H\u0003H\u00030\u0006\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"async", "Lio/reactivex/Completable;", "Lio/reactivex/Maybe;", "T", "kotlin.jvm.PlatformType", "Lio/reactivex/Observable;", "Lio/reactivex/Single;", "data_debug"})
public final class RxExtensionsKt {
    
    /**
     * Schedules {@link Single} to execute in {@code io} and observe it on {@code mainThread}
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    public static final <T extends java.lang.Object>io.reactivex.Single<T> async(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $this$async) {
        return null;
    }
    
    /**
     * Schedules {@link Maybe} to execute in {@code io} and observe it on {@code mainThread}
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    public static final <T extends java.lang.Object>io.reactivex.Maybe<T> async(@org.jetbrains.annotations.NotNull()
    io.reactivex.Maybe<T> $this$async) {
        return null;
    }
    
    /**
     * Schedules {@link Observable} to execute in {@code io} and observe it on {@code mainThread}
     */
    @androidx.annotation.MainThread()
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> async(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $this$async) {
        return null;
    }
    
    /**
     * Schedules {@link Completable} to execute in {@code io} and observe it on {@code mainThread}
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    public static final io.reactivex.Completable async(@org.jetbrains.annotations.NotNull()
    io.reactivex.Completable $this$async) {
        return null;
    }
}