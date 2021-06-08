package com.android.architecture.ui.base;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J>\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0 J\u000e\u0010!\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\""}, d2 = {"Lcom/android/architecture/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "closeKeyboard", "", "configureView", "handleApiError", "error", "", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setToolbarAction", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "setToolbarActionWithTitle", "title", "", "showSnackBar", "parentView", "msg", "length", "", "action", "actionCallback", "Lkotlin/Function0;", "showToast", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public void configureView() {
    }
    
    public final void setToolbarActionWithTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setToolbarActionWithTitle(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setToolbarAction(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    public final void closeKeyboard() {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.Nullable()
    android.view.View parentView, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int length, @org.jetbrains.annotations.Nullable()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> actionCallback) {
    }
    
    public final void handleApiError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable error) {
    }
    
    public BaseFragment() {
        super();
    }
}