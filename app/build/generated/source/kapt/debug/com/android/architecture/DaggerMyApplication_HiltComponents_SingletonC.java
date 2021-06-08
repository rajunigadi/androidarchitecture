package com.android.architecture;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.android.architecture.data.repository.network.Api;
import com.android.architecture.data.repository.network.Repo;
import com.android.architecture.di.module.BaseUrlModule;
import com.android.architecture.di.module.BaseUrlModule_ProvideUrlFactory;
import com.android.architecture.di.module.ImageModule;
import com.android.architecture.di.module.ImageModule_ProvideGlideFactory;
import com.android.architecture.di.module.NetworkModule;
import com.android.architecture.di.module.NetworkModule_ProvideOkHttpClientFactory;
import com.android.architecture.di.module.NetworkModule_ProvidesRetrofitApiFactory;
import com.android.architecture.di.module.RepoModule;
import com.android.architecture.di.module.RepoModule_ProvideRepoFactory;
import com.android.architecture.ui.MainActivity;
import com.android.architecture.ui.base.BaseFragment;
import com.android.architecture.ui.userinfo.UserItemFragment;
import com.android.architecture.ui.userinfo.UserItemFragment_MembersInjector;
import com.android.architecture.ui.userinfo.UserItemViewModel;
import com.android.architecture.ui.userinfo.UserItemViewModel_HiltModules_KeyModule_ProvideFactory;
import com.android.architecture.ui.users.UserAdapter;
import com.android.architecture.ui.users.UserFragment;
import com.android.architecture.ui.users.UserFragment_MembersInjector;
import com.android.architecture.ui.users.UserViewModel;
import com.android.architecture.ui.users.UserViewModel_HiltModules_KeyModule_ProvideFactory;
import com.bumptech.glide.RequestManager;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMyApplication_HiltComponents_SingletonC extends MyApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final ImageModule imageModule;

  private final RepoModule repoModule;

  private final NetworkModule networkModule;

  private final BaseUrlModule baseUrlModule;

  private volatile Object requestManager = new MemoizedSentinel();

  private volatile Object string = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object api = new MemoizedSentinel();

  private volatile Object repo = new MemoizedSentinel();

  private DaggerMyApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam, BaseUrlModule baseUrlModuleParam,
      ImageModule imageModuleParam, NetworkModule networkModuleParam, RepoModule repoModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.imageModule = imageModuleParam;
    this.repoModule = repoModuleParam;
    this.networkModule = networkModuleParam;
    this.baseUrlModule = baseUrlModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private RequestManager requestManager() {
    Object local = requestManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = requestManager;
        if (local instanceof MemoizedSentinel) {
          local = ImageModule_ProvideGlideFactory.provideGlide(imageModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          requestManager = DoubleCheck.reentrantCheck(requestManager, local);
        }
      }
    }
    return (RequestManager) local;
  }

  private String string() {
    Object local = string;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = string;
        if (local instanceof MemoizedSentinel) {
          local = BaseUrlModule_ProvideUrlFactory.provideUrl(baseUrlModule);
          string = DoubleCheck.reentrantCheck(string, local);
        }
      }
    }
    return (String) local;
  }

  private OkHttpClient okHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvideOkHttpClientFactory.provideOkHttpClient(networkModule);
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Api api() {
    Object local = api;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = api;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidesRetrofitApiFactory.providesRetrofitApi(networkModule, string(), okHttpClient());
          api = DoubleCheck.reentrantCheck(api, local);
        }
      }
    }
    return (Api) local;
  }

  private Repo repo() {
    Object local = repo;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = repo;
        if (local instanceof MemoizedSentinel) {
          local = RepoModule_ProvideRepoFactory.provideRepo(repoModule, api());
          repo = DoubleCheck.reentrantCheck(repo, local);
        }
      }
    }
    return (Repo) local;
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private BaseUrlModule baseUrlModule;

    private ImageModule imageModule;

    private NetworkModule networkModule;

    private RepoModule repoModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder baseUrlModule(BaseUrlModule baseUrlModule) {
      this.baseUrlModule = Preconditions.checkNotNull(baseUrlModule);
      return this;
    }

    public Builder imageModule(ImageModule imageModule) {
      this.imageModule = Preconditions.checkNotNull(imageModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder repoModule(RepoModule repoModule) {
      this.repoModule = Preconditions.checkNotNull(repoModule);
      return this;
    }

    public MyApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (baseUrlModule == null) {
        this.baseUrlModule = new BaseUrlModule();
      }
      if (imageModule == null) {
        this.imageModule = new ImageModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (repoModule == null) {
        this.repoModule = new RepoModule();
      }
      return new DaggerMyApplication_HiltComponents_SingletonC(applicationContextModule, baseUrlModule, imageModule, networkModule, repoModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectHiltTestActivity(HiltTestActivity arg0) {
      }

      @Override
      public void injectMainActivity(MainActivity arg0) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_SingletonC.this.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return SetBuilder.<String>newSetBuilder(2).add(UserItemViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(UserViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(fragment);
        }
      }

      private final class FragmentCI extends MyApplication_HiltComponents.FragmentC {
        private FragmentCI(Fragment fragment) {

        }

        private UserAdapter userAdapter() {
          return new UserAdapter(DaggerMyApplication_HiltComponents_SingletonC.this.requestManager());
        }

        @Override
        public void injectBaseFragment(BaseFragment arg0) {
        }

        @Override
        public void injectUserItemFragment(UserItemFragment arg0) {
          injectUserItemFragment2(arg0);
        }

        @Override
        public void injectUserFragment(UserFragment arg0) {
          injectUserFragment2(arg0);
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private UserItemFragment injectUserItemFragment2(UserItemFragment instance) {
          UserItemFragment_MembersInjector.injectRequestManager(instance, DaggerMyApplication_HiltComponents_SingletonC.this.requestManager());
          return instance;
        }

        private UserFragment injectUserFragment2(UserFragment instance) {
          UserFragment_MembersInjector.injectUserAdapter(instance, userAdapter());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(view);
          }
        }

        private final class ViewWithFragmentCI extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCI(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(view);
        }
      }

      private final class ViewCI extends MyApplication_HiltComponents.ViewC {
        private ViewCI(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements MyApplication_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle arg0) {
        this.savedStateHandle = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MyApplication_HiltComponents.ViewModelC {
      private volatile Provider<UserItemViewModel> userItemViewModelProvider;

      private volatile Provider<UserViewModel> userViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private UserItemViewModel userItemViewModel() {
        return new UserItemViewModel(DaggerMyApplication_HiltComponents_SingletonC.this.repo());
      }

      private Provider<UserItemViewModel> userItemViewModelProvider() {
        Object local = userItemViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          userItemViewModelProvider = (Provider<UserItemViewModel>) local;
        }
        return (Provider<UserItemViewModel>) local;
      }

      private UserViewModel userViewModel() {
        return new UserViewModel(DaggerMyApplication_HiltComponents_SingletonC.this.repo());
      }

      private Provider<UserViewModel> userViewModelProvider() {
        Object local = userViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          userViewModelProvider = (Provider<UserViewModel>) local;
        }
        return (Provider<UserViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.android.architecture.ui.userinfo.UserItemViewModel", (Provider) userItemViewModelProvider()).put("com.android.architecture.ui.users.UserViewModel", (Provider) userViewModelProvider()).build();
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.android.architecture.ui.userinfo.UserItemViewModel 
            return (T) ViewModelCImpl.this.userItemViewModel();

            case 1: // com.android.architecture.ui.users.UserViewModel 
            return (T) ViewModelCImpl.this.userViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
