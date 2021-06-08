package com.android.architecture.ui.userinfo

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class UserItemFragmentArgs(
  public val login: String? = null
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("login", this.login)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): UserItemFragmentArgs {
      bundle.setClassLoader(UserItemFragmentArgs::class.java.classLoader)
      val __login : String?
      if (bundle.containsKey("login")) {
        __login = bundle.getString("login")
      } else {
        __login = null
      }
      return UserItemFragmentArgs(__login)
    }
  }
}
