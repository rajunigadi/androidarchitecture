package com.android.architecture.ui.users;

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
public final class UserFragment_MembersInjector implements MembersInjector<UserFragment> {
  private final Provider<UserAdapter> userAdapterProvider;

  public UserFragment_MembersInjector(Provider<UserAdapter> userAdapterProvider) {
    this.userAdapterProvider = userAdapterProvider;
  }

  public static MembersInjector<UserFragment> create(Provider<UserAdapter> userAdapterProvider) {
    return new UserFragment_MembersInjector(userAdapterProvider);
  }

  @Override
  public void injectMembers(UserFragment instance) {
    injectUserAdapter(instance, userAdapterProvider.get());
  }

  @InjectedFieldSignature("com.android.architecture.ui.users.UserFragment.userAdapter")
  public static void injectUserAdapter(UserFragment instance, UserAdapter userAdapter) {
    instance.userAdapter = userAdapter;
  }
}
