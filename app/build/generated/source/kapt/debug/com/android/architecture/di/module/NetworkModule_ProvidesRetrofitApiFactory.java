package com.android.architecture.di.module;

import com.android.architecture.data.repository.network.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
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
public final class NetworkModule_ProvidesRetrofitApiFactory implements Factory<Api> {
  private final NetworkModule module;

  private final Provider<String> baseUrlProvider;

  private final Provider<OkHttpClient> httpClientProvider;

  public NetworkModule_ProvidesRetrofitApiFactory(NetworkModule module,
      Provider<String> baseUrlProvider, Provider<OkHttpClient> httpClientProvider) {
    this.module = module;
    this.baseUrlProvider = baseUrlProvider;
    this.httpClientProvider = httpClientProvider;
  }

  @Override
  public Api get() {
    return providesRetrofitApi(module, baseUrlProvider.get(), httpClientProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitApiFactory create(NetworkModule module,
      Provider<String> baseUrlProvider, Provider<OkHttpClient> httpClientProvider) {
    return new NetworkModule_ProvidesRetrofitApiFactory(module, baseUrlProvider, httpClientProvider);
  }

  public static Api providesRetrofitApi(NetworkModule instance, String baseUrl,
      OkHttpClient httpClient) {
    return Preconditions.checkNotNullFromProvides(instance.providesRetrofitApi(baseUrl, httpClient));
  }
}
