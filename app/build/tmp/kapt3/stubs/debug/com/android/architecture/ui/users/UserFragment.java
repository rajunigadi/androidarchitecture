package com.android.architecture.ui.users;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import com.android.architecture.common.ObservableData;
import com.android.architecture.common.RecycleViewItemClickListener;
import com.android.architecture.data.repository.network.User;
import com.android.architecture.databinding.FragmentUserBinding;
import com.android.architecture.ui.base.BaseFragment;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010\'\u001a\u00020\u001cH\u0016J\b\u0010(\u001a\u00020\u001cH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR&\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006)"}, d2 = {"Lcom/android/architecture/ui/users/UserFragment;", "Lcom/android/architecture/ui/base/BaseFragment;", "Lcom/android/architecture/common/RecycleViewItemClickListener;", "Lcom/android/architecture/data/repository/network/User;", "()V", "_binding", "Lcom/android/architecture/databinding/FragmentUserBinding;", "binding", "getBinding", "()Lcom/android/architecture/databinding/FragmentUserBinding;", "dealsObserver", "Landroidx/lifecycle/Observer;", "Lcom/android/architecture/common/ObservableData;", "", "", "userAdapter", "Lcom/android/architecture/ui/users/UserAdapter;", "getUserAdapter", "()Lcom/android/architecture/ui/users/UserAdapter;", "setUserAdapter", "(Lcom/android/architecture/ui/users/UserAdapter;)V", "viewModel", "Lcom/android/architecture/ui/users/UserViewModel;", "getViewModel", "()Lcom/android/architecture/ui/users/UserViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "configureView", "", "onClick", "item", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class UserFragment extends com.android.architecture.ui.base.BaseFragment implements com.android.architecture.common.RecycleViewItemClickListener<com.android.architecture.data.repository.network.User> {
    private com.android.architecture.databinding.FragmentUserBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.android.architecture.ui.users.UserAdapter userAdapter;
    private final androidx.lifecycle.Observer<com.android.architecture.common.ObservableData<java.util.List<com.android.architecture.data.repository.network.User>, java.lang.Throwable>> dealsObserver = null;
    
    private final com.android.architecture.databinding.FragmentUserBinding getBinding() {
        return null;
    }
    
    private final com.android.architecture.ui.users.UserViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.architecture.ui.users.UserAdapter getUserAdapter() {
        return null;
    }
    
    public final void setUserAdapter(@org.jetbrains.annotations.NotNull()
    com.android.architecture.ui.users.UserAdapter p0) {
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
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.android.architecture.data.repository.network.User item) {
    }
    
    public UserFragment() {
        super();
    }
}