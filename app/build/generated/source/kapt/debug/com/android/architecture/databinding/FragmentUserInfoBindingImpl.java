package com.android.architecture.databinding;
import com.android.architecture.R;
import com.android.architecture.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentUserInfoBindingImpl extends FragmentUserInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentUserInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentUserInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.clContent.setTag(null);
        this.tvCompany.setTag(null);
        this.tvName.setTag(null);
        this.tvPublicGists.setTag(null);
        this.tvPublicRepose.setTag(null);
        setRootTag(root);
        // listeners
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
        java.lang.Integer itemPublicRepos = null;
        java.lang.String stringValueOfItemPublicRepos = null;
        java.lang.String stringValueOfItemPublicGists = null;
        com.android.architecture.data.repository.network.User item = mItem;
        int androidxDatabindingViewDataBindingSafeUnboxItemPublicRepos = 0;
        java.lang.String itemName = null;
        java.lang.String javaLangStringPublicGistsStringValueOfItemPublicGists = null;
        java.lang.String itemCompany = null;
        java.lang.Integer itemPublicGists = null;
        java.lang.String javaLangStringPublicReposStringValueOfItemPublicRepos = null;
        int androidxDatabindingViewDataBindingSafeUnboxItemPublicGists = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.publicRepos
                    itemPublicRepos = item.getPublicRepos();
                    // read item.name
                    itemName = item.getName();
                    // read item.company
                    itemCompany = item.getCompany();
                    // read item.publicGists
                    itemPublicGists = item.getPublicGists();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(item.publicRepos)
                androidxDatabindingViewDataBindingSafeUnboxItemPublicRepos = androidx.databinding.ViewDataBinding.safeUnbox(itemPublicRepos);
                // read androidx.databinding.ViewDataBinding.safeUnbox(item.publicGists)
                androidxDatabindingViewDataBindingSafeUnboxItemPublicGists = androidx.databinding.ViewDataBinding.safeUnbox(itemPublicGists);


                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.publicRepos))
                stringValueOfItemPublicRepos = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemPublicRepos);
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.publicGists))
                stringValueOfItemPublicGists = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxItemPublicGists);


                // read ("Public Repos: ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.publicRepos)))
                javaLangStringPublicReposStringValueOfItemPublicRepos = ("Public Repos: ") + (stringValueOfItemPublicRepos);
                // read ("Public Gists: ") + (String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(item.publicGists)))
                javaLangStringPublicGistsStringValueOfItemPublicGists = ("Public Gists: ") + (stringValueOfItemPublicGists);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCompany, itemCompany);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPublicGists, javaLangStringPublicGistsStringValueOfItemPublicGists);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPublicRepose, javaLangStringPublicReposStringValueOfItemPublicRepos);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): itemClickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}