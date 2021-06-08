package com.android.architecture.ui.users

import com.android.architecture.common.ActionableLiveData
import com.android.architecture.common.BaseLiveData
import com.android.architecture.common.ObservableData
import com.android.architecture.data.repository.network.Repo
import com.android.architecture.data.repository.network.User
import com.android.architecture.data.utils.async
import com.android.architecture.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repo: Repo): BaseViewModel() {

    private val deals = disposableLiveData {
        ActionableLiveData<MutableList<User>>()
    }

    fun deals(): BaseLiveData<ObservableData<MutableList<User>, Throwable>> =
        deals.apply {
            actionBlock = {
                repo
                    .users()
                    .async()
            }
        }
}