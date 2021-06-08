package com.android.architecture.ui.users;

import com.bumptech.glide.RequestManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserAdapter_Factory implements Factory<UserAdapter> {
  private final Provider<RequestManager> requestManagerProvider;

  public UserAdapter_Factory(Provider<RequestManager> requestManagerProvider) {
    this.requestManagerProvider = requestManagerProvider;
  }

  @Override
  public UserAdapter get() {
    return newInstance(requestManagerProvider.get());
  }

  public static UserAdapter_Factory create(Provider<RequestManager> requestManagerProvider) {
    return new UserAdapter_Factory(requestManagerProvider);
  }

  public static UserAdapter newInstance(RequestManager requestManager) {
    return new UserAdapter(requestManager);
  }
}
