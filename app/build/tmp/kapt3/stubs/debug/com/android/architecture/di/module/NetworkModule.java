package com.android.architecture.di.module;

import com.android.architecture.BuildConfig;
import com.android.architecture.data.repository.network.Api;
import com.android.architecture.data.repository.network.RxErrorHandlingCallAdapterFactory;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/android/architecture/di/module/NetworkModule;", "", "()V", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "providesRetrofit", "Lretrofit2/Retrofit;", "httpClient", "baseUrl", "", "isRxCallAdapter", "", "(Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/Boolean;)Lretrofit2/Retrofit;", "providesRetrofitApi", "Lcom/android/architecture/data/repository/network/Api;", "app_debug"})
@dagger.Module(includes = {com.android.architecture.di.module.BaseUrlModule.class})
public final class NetworkModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.android.architecture.data.repository.network.Api providesRetrofitApi(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient httpClient) {
        return null;
    }
    
    private final retrofit2.Retrofit providesRetrofit(okhttp3.OkHttpClient httpClient, java.lang.String baseUrl, java.lang.Boolean isRxCallAdapter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}