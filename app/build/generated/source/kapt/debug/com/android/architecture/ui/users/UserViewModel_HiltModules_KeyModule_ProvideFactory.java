package com.android.architecture.ui.users;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static UserViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(UserViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final UserViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new UserViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
