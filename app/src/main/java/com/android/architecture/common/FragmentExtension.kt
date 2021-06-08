package com.android.architecture.common

import androidx.fragment.app.Fragment
import com.android.architecture.ui.base.BaseActivity

fun Fragment.showLoading() {
    when (activity) {
        is BaseActivity -> (activity as BaseActivity).showLoading()
    }
}

fun Fragment.hideLoading() {
    when (activity) {
        is BaseActivity -> (activity as BaseActivity).hideLoading()
    }
}