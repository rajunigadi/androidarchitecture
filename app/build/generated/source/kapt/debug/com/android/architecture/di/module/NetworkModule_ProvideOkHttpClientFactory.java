package com.android.architecture.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_ProvideOkHttpClientFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module);
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule module) {
    return new NetworkModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient provideOkHttpClient(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClient());
  }
}
