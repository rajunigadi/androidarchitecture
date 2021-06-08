package com.android.architecture

import com.android.architecture.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltTestActivity : BaseActivity() {
    override val layoutResourceId: Int = -1
}