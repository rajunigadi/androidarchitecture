package com.android.architecture.ui.users;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.RequestManager;
import com.android.architecture.R;
import com.android.architecture.common.RecycleViewItemClickListener;
import com.android.architecture.data.repository.network.User;
import com.android.architecture.databinding.UserItemBinding;
import com.android.architecture.ui.base.BaseRecyclerViewAdapter;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0019J\u0016\u0010\u001a\u001a\u00020\u00102\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lcom/android/architecture/ui/users/UserAdapter;", "Lcom/android/architecture/ui/base/BaseRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "items", "", "Lcom/android/architecture/data/repository/network/User;", "listener", "Lcom/android/architecture/common/RecycleViewItemClickListener;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "newItems", "", "setOnClickListener", "itemClickListener", "UserViewHolder", "app_debug"})
public final class UserAdapter extends com.android.architecture.ui.base.BaseRecyclerViewAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private com.android.architecture.common.RecycleViewItemClickListener<com.android.architecture.data.repository.network.User> listener;
    private java.util.List<com.android.architecture.data.repository.network.User> items;
    @org.jetbrains.annotations.NotNull()
    private final com.bumptech.glide.RequestManager requestManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.android.architecture.data.repository.network.User> newItems) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.Nullable()
    com.android.architecture.common.RecycleViewItemClickListener<com.android.architecture.data.repository.network.User> itemClickListener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager requestManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/android/architecture/ui/users/UserAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemRowBinding", "Lcom/android/architecture/databinding/UserItemBinding;", "(Lcom/android/architecture/ui/users/UserAdapter;Lcom/android/architecture/databinding/UserItemBinding;)V", "getItemRowBinding", "()Lcom/android/architecture/databinding/UserItemBinding;", "setItemRowBinding", "(Lcom/android/architecture/databinding/UserItemBinding;)V", "bind", "", "item", "Lcom/android/architecture/data/repository/network/User;", "app_debug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.android.architecture.databinding.UserItemBinding itemRowBinding;
        
        @org.jetbrains.annotations.NotNull()
        public final com.android.architecture.databinding.UserItemBinding getItemRowBinding() {
            return null;
        }
        
        public final void setItemRowBinding(@org.jetbrains.annotations.NotNull()
        com.android.architecture.databinding.UserItemBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.android.architecture.data.repository.network.User item) {
        }
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.android.architecture.databinding.UserItemBinding itemRowBinding) {
            super(null);
        }
    }
}