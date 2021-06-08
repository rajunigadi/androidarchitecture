package com.android.architecture.ui.users;

import com.android.architecture.common.ActionableLiveData;
import com.android.architecture.common.BaseLiveData;
import com.android.architecture.common.ObservableData;
import com.android.architecture.data.repository.network.Repo;
import com.android.architecture.data.repository.network.User;
import com.android.architecture.ui.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\u000b0\n0\tR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/android/architecture/ui/users/UserViewModel;", "Lcom/android/architecture/ui/base/BaseViewModel;", "repo", "Lcom/android/architecture/data/repository/network/Repo;", "(Lcom/android/architecture/data/repository/network/Repo;)V", "deals", "Lcom/android/architecture/common/ActionableLiveData;", "", "Lcom/android/architecture/data/repository/network/User;", "Lcom/android/architecture/common/BaseLiveData;", "Lcom/android/architecture/common/ObservableData;", "", "app_debug"})
public final class UserViewModel extends com.android.architecture.ui.base.BaseViewModel {
    private final com.android.architecture.common.ActionableLiveData<java.util.List<com.android.architecture.data.repository.network.User>> deals = null;
    private final com.android.architecture.data.repository.network.Repo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.architecture.common.BaseLiveData<com.android.architecture.common.ObservableData<java.util.List<com.android.architecture.data.repository.network.User>, java.lang.Throwable>> deals() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.android.architecture.data.repository.network.Repo repo) {
        super();
    }
}