package com.android.architecture.data.utils.timber;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014\u00a8\u0006\u000f"}, d2 = {"Lcom/android/architecture/data/utils/timber/DebugTree;", "Ltimber/log/Timber$DebugTree;", "()V", "createStackElementTag", "", "element", "Ljava/lang/StackTraceElement;", "log", "", "prior", "", "tag", "message", "t", "", "data_debug"})
public final class DebugTree extends timber.log.Timber.DebugTree {
    
    @java.lang.Override()
    protected void log(int prior, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String createStackElementTag(@org.jetbrains.annotations.NotNull()
    java.lang.StackTraceElement element) {
        return null;
    }
    
    public DebugTree() {
        super();
    }
}