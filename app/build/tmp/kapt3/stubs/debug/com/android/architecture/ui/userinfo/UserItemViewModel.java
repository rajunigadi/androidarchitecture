package com.android.architecture.ui.userinfo;

import com.android.architecture.common.ActionableLiveData;
import com.android.architecture.common.BaseLiveData;
import com.android.architecture.common.ObservableData;
import com.android.architecture.data.repository.network.Repo;
import com.android.architecture.data.repository.network.User;
import com.android.architecture.ui.base.BaseViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/android/architecture/ui/userinfo/UserItemViewModel;", "Lcom/android/architecture/ui/base/BaseViewModel;", "repo", "Lcom/android/architecture/data/repository/network/Repo;", "(Lcom/android/architecture/data/repository/network/Repo;)V", "dealsItem", "Lcom/android/architecture/common/ActionableLiveData;", "Lcom/android/architecture/data/repository/network/User;", "dealItem", "Lcom/android/architecture/common/BaseLiveData;", "Lcom/android/architecture/common/ObservableData;", "", "login", "", "app_debug"})
public final class UserItemViewModel extends com.android.architecture.ui.base.BaseViewModel {
    private final com.android.architecture.common.ActionableLiveData<com.android.architecture.data.repository.network.User> dealsItem = null;
    private final com.android.architecture.data.repository.network.Repo repo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.android.architecture.common.BaseLiveData<com.android.architecture.common.ObservableData<com.android.architecture.data.repository.network.User, java.lang.Throwable>> dealItem(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserItemViewModel(@org.jetbrains.annotations.NotNull()
    com.android.architecture.data.repository.network.Repo repo) {
        super();
    }
}