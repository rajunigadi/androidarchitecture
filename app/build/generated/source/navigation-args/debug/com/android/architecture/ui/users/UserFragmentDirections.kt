package com.android.architecture.ui.users

import android.os.Bundle
import androidx.navigation.NavDirections
import com.android.architecture.R
import kotlin.Int
import kotlin.String

public class UserFragmentDirections private constructor() {
  private data class ActionFragmentUserToFragmentUserItem(
    public val login: String? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_fragment_user_to_fragment_user_item

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("login", this.login)
      return result
    }
  }

  public companion object {
    public fun actionFragmentUserToFragmentUserItem(login: String? = null): NavDirections =
        ActionFragmentUserToFragmentUserItem(login)
  }
}
