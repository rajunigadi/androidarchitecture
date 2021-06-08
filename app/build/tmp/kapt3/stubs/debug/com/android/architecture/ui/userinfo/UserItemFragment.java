package com.android.architecture.ui.userinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bumptech.glide.RequestManager;
import com.android.architecture.R;
import com.android.architecture.common.ObservableData;
import com.android.architecture.data.repository.network.Product;
import com.android.architecture.data.repository.network.User;
import com.android.architecture.databinding.FragmentUserInfoBinding;
import com.android.architecture.ui.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import timber.log.Timber;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020 H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/android/architecture/ui/userinfo/UserItemFragment;", "Lcom/android/architecture/ui/base/BaseFragment;", "()V", "_binding", "Lcom/android/architecture/databinding/FragmentUserInfoBinding;", "args", "Lcom/android/architecture/ui/userinfo/UserItemFragmentArgs;", "getArgs", "()Lcom/android/architecture/ui/userinfo/UserItemFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/android/architecture/databinding/FragmentUserInfoBinding;", "dealsItemObserver", "Landroidx/lifecycle/Observer;", "Lcom/android/architecture/common/ObservableData;", "Lcom/android/architecture/data/repository/network/User;", "", "requestManager", "Lcom/bumptech/glide/RequestManager;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "setRequestManager", "(Lcom/bumptech/glide/RequestManager;)V", "viewModel", "Lcom/android/architecture/ui/userinfo/UserItemViewModel;", "getViewModel", "()Lcom/android/architecture/ui/userinfo/UserItemViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configureView", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class UserItemFragment extends com.android.architecture.ui.base.BaseFragment {
    private com.android.architecture.databinding.FragmentUserInfoBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @javax.inject.Inject()
    public com.bumptech.glide.RequestManager requestManager;
    private final androidx.lifecycle.Observer<com.android.architecture.common.ObservableData<com.android.architecture.data.repository.network.User, java.lang.Throwable>> dealsItemObserver = null;
    
    private final com.android.architecture.databinding.FragmentUserInfoBinding getBinding() {
        return null;
    }
    
    private final com.android.architecture.ui.userinfo.UserItemViewModel getViewModel() {
        return null;
    }
    
    private final com.android.architecture.ui.userinfo.UserItemFragmentArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    public final void setRequestManager(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void configureView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public UserItemFragment() {
        super();
    }
}