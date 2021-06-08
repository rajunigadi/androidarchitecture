package com.android.architecture.databinding;
import com.android.architecture.R;
import com.android.architecture.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class UserItemBindingImpl extends UserItemBinding implements com.android.architecture.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivAvatar, 2);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public UserItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private UserItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.dealListItem.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.android.architecture.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.item == variableId) {
            setItem((com.android.architecture.data.repository.network.User) variable);
        }
        else if (BR.itemClickListener == variableId) {
            setItemClickListener((com.android.architecture.common.RecycleViewItemClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.android.architecture.data.repository.network.User Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public void setItemClickListener(@Nullable com.android.architecture.common.RecycleViewItemClickListener ItemClickListener) {
        this.mItemClickListener = ItemClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.itemClickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String itemLogin = null;
        com.android.architecture.data.repository.network.User item = mItem;
        com.android.architecture.common.RecycleViewItemClickListener<?> itemClickListener = mItemClickListener;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.login
                    itemLogin = item.getLogin();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.dealListItem.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemLogin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.android.architecture.data.repository.network.User item = mItem;
        // itemClickListener
        com.android.architecture.common.RecycleViewItemClickListener itemClickListener = mItemClickListener;
        // itemClickListener != null
        boolean itemClickListenerJavaLangObjectNull = false;



        itemClickListenerJavaLangObjectNull = (itemClickListener) != (null);
        if (itemClickListenerJavaLangObjectNull) {



            itemClickListener.onClick(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): itemClickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}