package com.android.architecture.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ2\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/android/architecture/common/ObservableData;", "R", "E", "", "data", "error", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/android/architecture/common/ObservableData;", "equals", "", "other", "hasData", "hasError", "hashCode", "", "toString", "", "app_debug"})
public final class ObservableData<R extends java.lang.Object, E extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final R data = null;
    @org.jetbrains.annotations.Nullable()
    private final E error = null;
    
    public final boolean hasError() {
        return false;
    }
    
    public final boolean hasData() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final R getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final E getError() {
        return null;
    }
    
    public ObservableData(@org.jetbrains.annotations.Nullable()
    R data, @org.jetbrains.annotations.Nullable()
    E error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final R component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final E component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.architecture.common.ObservableData<R, E> copy(@org.jetbrains.annotations.Nullable()
    R data, @org.jetbrains.annotations.Nullable()
    E error) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}