package com.android.architecture.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
import com.android.architecture.data.repository.network.exceptions.ServerException;
import com.android.architecture.databinding.ActivityBaseBinding;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\nH\u0002J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\nH\u0014J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0014J\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\nJ<\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001d2\b\b\u0002\u0010#\u001a\u00020\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0&J\u000e\u0010\'\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001dR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006("}, d2 = {"Lcom/android/architecture/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/android/architecture/databinding/ActivityBaseBinding;", "layoutResourceId", "", "getLayoutResourceId", "()I", "closeKeyboard", "", "displayToolbar", "visible", "", "handleApiError", "error", "", "hideLoading", "init", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStop", "setToolbarActionWithTitle", "title", "", "showLoading", "showSnackBar", "parentView", "Landroid/view/View;", "msg", "length", "action", "actionCallback", "Lkotlin/Function0;", "showToast", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.android.architecture.databinding.ActivityBaseBinding binding;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void init() {
    }
    
    public final void displayToolbar(boolean visible) {
    }
    
    public final void setToolbarActionWithTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public final void closeKeyboard() {
    }
    
    public final void showSnackBar(@org.jetbrains.annotations.NotNull()
    android.view.View parentView, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int length, @org.jetbrains.annotations.Nullable()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> actionCallback) {
    }
    
    public final void handleApiError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error) {
    }
    
    @androidx.annotation.LayoutRes()
    public abstract int getLayoutResourceId();
    
    public BaseActivity() {
        super();
    }
}