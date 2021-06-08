package com.android.architecture.common;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.android.architecture.ui.base.BaseFragment;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0007H&J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/android/architecture/common/BaseLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "isShowLoading", "", "()Z", "setShowLoading", "(Z)V", "addDisposable", "disposable", "Lkotlin/Function0;", "Lio/reactivex/disposables/Disposable;", "clearAllDisposables", "", "observeWithFragment", "fragment", "Lcom/android/architecture/ui/base/BaseFragment;", "observer", "Landroidx/lifecycle/Observer;", "flag", "stopAllDisposables", "app_debug"})
public abstract class BaseLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private boolean isShowLoading = true;
    
    public final boolean addDisposable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends io.reactivex.disposables.Disposable> disposable) {
        return false;
    }
    
    public final void clearAllDisposables() {
    }
    
    public final void stopAllDisposables() {
    }
    
    public abstract void observeWithFragment(@org.jetbrains.annotations.NotNull()
    com.android.architecture.ui.base.BaseFragment fragment, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer, boolean flag);
    
    public final boolean isShowLoading() {
        return false;
    }
    
    public final void setShowLoading(boolean p0) {
    }
    
    public BaseLiveData() {
        super(null);
    }
}