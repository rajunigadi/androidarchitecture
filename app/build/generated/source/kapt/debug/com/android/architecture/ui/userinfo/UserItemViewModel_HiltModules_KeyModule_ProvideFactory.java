package com.android.architecture.ui.userinfo;

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
public final class UserItemViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static UserItemViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(UserItemViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final UserItemViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new UserItemViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
