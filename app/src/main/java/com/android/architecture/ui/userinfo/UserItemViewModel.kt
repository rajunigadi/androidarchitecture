package com.android.architecture.ui.userinfo

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
class UserItemViewModel @Inject constructor(private val repo: Repo): BaseViewModel() {

    private val dealsItem = disposableLiveData {
        ActionableLiveData<User>()
    }

    fun dealItem(login: String): BaseLiveData<ObservableData<User, Throwable>> =
        dealsItem.apply {
            actionBlock = {
                repo
                    .userItem(login)
                    .async()
            }
        }
}