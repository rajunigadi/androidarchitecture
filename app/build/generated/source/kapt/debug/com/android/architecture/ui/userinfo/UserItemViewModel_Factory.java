package com.android.architecture.ui.userinfo;

import com.android.architecture.data.repository.network.Repo;
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
public final class UserItemViewModel_Factory implements Factory<UserItemViewModel> {
  private final Provider<Repo> repoProvider;

  public UserItemViewModel_Factory(Provider<Repo> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public UserItemViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static UserItemViewModel_Factory create(Provider<Repo> repoProvider) {
    return new UserItemViewModel_Factory(repoProvider);
  }

  public static UserItemViewModel newInstance(Repo repo) {
    return new UserItemViewModel(repo);
  }
}
