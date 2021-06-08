package com.android.architecture.ui.base;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J#\u0010\u000f\u001a\u0002H\u0001\"\b\b\u0001\u0010\u0001*\u00020\u0010*\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/android/architecture/ui/base/BaseRecyclerViewAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "attachedToRecyclerView", "", "getAttachedToRecyclerView", "()Z", "setAttachedToRecyclerView", "(Z)V", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getViewBinding", "Landroidx/databinding/ViewDataBinding;", "Landroid/view/ViewGroup;", "res", "", "(Landroid/view/ViewGroup;I)Landroidx/databinding/ViewDataBinding;", "app_debug"})
public abstract class BaseRecyclerViewAdapter<T extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<T> {
    private boolean attachedToRecyclerView = false;
    
    public final boolean getAttachedToRecyclerView() {
        return false;
    }
    
    public final void setAttachedToRecyclerView(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends androidx.databinding.ViewDataBinding>T getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$getViewBinding, @androidx.annotation.LayoutRes()
    int res) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttachedToRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
    
    public BaseRecyclerViewAdapter() {
        super();
    }
}