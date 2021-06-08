package com.android.architecture.ui.users;

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
public final class UserViewModel_Factory implements Factory<UserViewModel> {
  private final Provider<Repo> repoProvider;

  public UserViewModel_Factory(Provider<Repo> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public UserViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static UserViewModel_Factory create(Provider<Repo> repoProvider) {
    return new UserViewModel_Factory(repoProvider);
  }

  public static UserViewModel newInstance(Repo repo) {
    return new UserViewModel(repo);
  }
}
