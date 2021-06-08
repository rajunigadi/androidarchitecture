package com.android.architecture.di.module;

import android.content.Context;
import com.bumptech.glide.RequestManager;
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
public final class ImageModule_ProvideGlideFactory implements Factory<RequestManager> {
  private final ImageModule module;

  private final Provider<Context> contextProvider;

  public ImageModule_ProvideGlideFactory(ImageModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public RequestManager get() {
    return provideGlide(module, contextProvider.get());
  }

  public static ImageModule_ProvideGlideFactory create(ImageModule module,
      Provider<Context> contextProvider) {
    return new ImageModule_ProvideGlideFactory(module, contextProvider);
  }

  public static RequestManager provideGlide(ImageModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideGlide(context));
  }
}
