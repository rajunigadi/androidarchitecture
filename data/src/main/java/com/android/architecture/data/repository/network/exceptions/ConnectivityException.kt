package com.android.architecture.data.repository.network.exceptions

import java.io.IOException

class ConnectivityException : IOException() {
    override val message: String
        get() = "No Internet Connection"
}