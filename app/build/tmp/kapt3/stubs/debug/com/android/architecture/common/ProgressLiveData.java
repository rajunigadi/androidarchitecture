package com.android.architecture.common;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import com.android.architecture.ui.base.BaseFragment;
import java.lang.ref.WeakReference;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0004J(\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/android/architecture/common/ProgressLiveData;", "T", "Lcom/android/architecture/common/BaseLiveData;", "()V", "owners", "", "Ljava/lang/ref/WeakReference;", "Lcom/android/architecture/ui/base/BaseFragment;", "hideLoading", "", "observeWithFragment", "fragment", "observer", "Landroidx/lifecycle/Observer;", "flag", "", "setValue", "value", "(Ljava/lang/Object;)V", "showLoading", "owner", "app_debug"})
public class ProgressLiveData<T extends java.lang.Object> extends com.android.architecture.common.BaseLiveData<T> {
    private final java.util.Set<java.lang.ref.WeakReference<com.android.architecture.ui.base.BaseFragment>> owners = null;
    
    @java.lang.Override()
    public void observeWithFragment(@org.jetbrains.annotations.NotNull()
    com.android.architecture.ui.base.BaseFragment fragment, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer, boolean flag) {
    }
    
    @java.lang.Override()
    public void setValue(T value) {
    }
    
    private final void showLoading(com.android.architecture.ui.base.BaseFragment owner) {
    }
    
    protected final void hideLoading() {
    }
    
    public ProgressLiveData() {
        super();
    }
}