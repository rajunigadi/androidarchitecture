package com.android.architecture.data.utils.timber;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J,\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014\u00a8\u0006\u000f"}, d2 = {"Lcom/android/architecture/data/utils/timber/ReleaseTree;", "Ltimber/log/Timber$Tree;", "()V", "isLoggable", "", "tag", "", "priority", "", "log", "", "message", "t", "", "Companion", "data_debug"})
public final class ReleaseTree extends timber.log.Timber.Tree {
    public static final int MAX_LOG_LENGTH = 4000;
    @org.jetbrains.annotations.NotNull()
    public static final com.android.architecture.data.utils.timber.ReleaseTree.Companion Companion = null;
    
    @java.lang.Override()
    protected boolean isLoggable(@org.jetbrains.annotations.Nullable()
    java.lang.String tag, int priority) {
        return false;
    }
    
    @java.lang.Override()
    protected void log(int priority, @org.jetbrains.annotations.Nullable()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    public ReleaseTree() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/android/architecture/data/utils/timber/ReleaseTree$Companion;", "", "()V", "MAX_LOG_LENGTH", "", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}