package com.android.architecture.ui.base;

import androidx.lifecycle.ViewModel;
import com.android.architecture.common.BaseLiveData;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\'\u0010\r\u001a\u0002H\u000e\"\f\b\u0000\u0010\u000e*\u0006\u0012\u0002\b\u00030\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u000b\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\tH\u0014R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/android/architecture/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "allLiveData", "", "Lcom/android/architecture/common/BaseLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "addDisposable", "", "disposableBlock", "Lkotlin/Function0;", "Lio/reactivex/disposables/Disposable;", "disposableLiveData", "T", "block", "(Lkotlin/jvm/functions/Function0;)Lcom/android/architecture/common/BaseLiveData;", "onCleared", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final java.util.Set<com.android.architecture.common.BaseLiveData<?>> allLiveData = null;
    
    public final void addDisposable(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends io.reactivex.disposables.Disposable> disposableBlock) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends com.android.architecture.common.BaseLiveData<?>>T disposableLiveData(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> block) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public BaseViewModel() {
        super();
    }
}