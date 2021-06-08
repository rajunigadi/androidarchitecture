package com.android.architecture.common;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import io.reactivex.Single;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u00030\u0002B\u001d\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u001a\u0010\u0010\u001a\u0016\u0012\u0012\b\u0000\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0014R(\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/android/architecture/common/ActionableLiveData;", "T", "Lcom/android/architecture/common/ProgressLiveData;", "Lcom/android/architecture/common/ObservableData;", "", "actionBlock", "Lkotlin/Function0;", "Lio/reactivex/Single;", "(Lkotlin/jvm/functions/Function0;)V", "getActionBlock", "()Lkotlin/jvm/functions/Function0;", "setActionBlock", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "performAction", "app_debug"})
public class ActionableLiveData<T extends java.lang.Object> extends com.android.architecture.common.ProgressLiveData<com.android.architecture.common.ObservableData<T, java.lang.Throwable>> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<? extends io.reactivex.Single<T>> actionBlock;
    
    @java.lang.Override()
    public void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super com.android.architecture.common.ObservableData<T, java.lang.Throwable>> observer) {
    }
    
    protected void performAction() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<io.reactivex.Single<T>> getActionBlock() {
        return null;
    }
    
    public final void setActionBlock(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends io.reactivex.Single<T>> p0) {
    }
    
    public ActionableLiveData(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<? extends io.reactivex.Single<T>> actionBlock) {
        super();
    }
    
    public ActionableLiveData() {
        super();
    }
}