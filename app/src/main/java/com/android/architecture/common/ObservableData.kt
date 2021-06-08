package com.android.architecture.common

data class ObservableData<R, E>(val data: R?, val error: E?) {
    fun hasError() = error != null
    fun hasData() = data != null
}