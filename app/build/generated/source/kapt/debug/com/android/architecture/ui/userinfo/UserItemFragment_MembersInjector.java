package com.android.architecture.ui.userinfo;

import com.bumptech.glide.RequestManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class UserItemFragment_MembersInjector implements MembersInjector<UserItemFragment> {
  private final Provider<RequestManager> requestManagerProvider;

  public UserItemFragment_MembersInjector(Provider<RequestManager> requestManagerProvider) {
    this.requestManagerProvider = requestManagerProvider;
  }

  public static MembersInjector<UserItemFragment> create(
      Provider<RequestManager> requestManagerProvider) {
    return new UserItemFragment_MembersInjector(requestManagerProvider);
  }

  @Override
  public void injectMembers(UserItemFragment instance) {
    injectRequestManager(instance, requestManagerProvider.get());
  }

  @InjectedFieldSignature("com.android.architecture.ui.userinfo.UserItemFragment.requestManager")
  public static void injectRequestManager(UserItemFragment instance,
      RequestManager requestManager) {
    instance.requestManager = requestManager;
  }
}
