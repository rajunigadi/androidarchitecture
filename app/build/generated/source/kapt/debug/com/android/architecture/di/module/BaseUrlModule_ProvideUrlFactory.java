package com.android.architecture.di.module;

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
public final class BaseUrlModule_ProvideUrlFactory implements Factory<String> {
  private final BaseUrlModule module;

  public BaseUrlModule_ProvideUrlFactory(BaseUrlModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideUrl(module);
  }

  public static BaseUrlModule_ProvideUrlFactory create(BaseUrlModule module) {
    return new BaseUrlModule_ProvideUrlFactory(module);
  }

  public static String provideUrl(BaseUrlModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUrl());
  }
}
