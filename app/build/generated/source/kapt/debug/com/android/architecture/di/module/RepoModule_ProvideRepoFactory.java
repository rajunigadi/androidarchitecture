package com.android.architecture.di.module;

import com.android.architecture.data.repository.network.Api;
import com.android.architecture.data.repository.network.Repo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepoModule_ProvideRepoFactory implements Factory<Repo> {
  private final RepoModule module;

  private final Provider<Api> apiProvider;

  public RepoModule_ProvideRepoFactory(RepoModule module, Provider<Api> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public Repo get() {
    return provideRepo(module, apiProvider.get());
  }

  public static RepoModule_ProvideRepoFactory create(RepoModule module, Provider<Api> apiProvider) {
    return new RepoModule_ProvideRepoFactory(module, apiProvider);
  }

  public static Repo provideRepo(RepoModule instance, Api api) {
    return Preconditions.checkNotNullFromProvides(instance.provideRepo(api));
  }
}
