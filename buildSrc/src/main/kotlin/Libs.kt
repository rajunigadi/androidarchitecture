object Libs {

    const val KOTLIN_STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.30"

    // android
    const val CORE_KTX = "androidx.core:core-ktx:1.3.2"
    const val DESIGN = "com.google.android.material:material:1.2.1"

    const val ANNOTATION = "androidx.annotation:annotation:1.1.0"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.1.0"
    const val CARD_VIEW = "androidx.cardview:cardview:1.0.0"
    const val PERCENT_LAYOUT = "androidx.percentlayout:percentlayout:1.0.0"
    const val SUPPORT_V4 = "androidx.legacy:legacy-support-v4:1.0.0"
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.2.0"
    const val SUPPORT_V13 = "androidx.legacy:legacy-support-v13:1.0.0"
    const val VECTOR_DRAWABLE = "androidx.vectordrawable:vectordrawable:1.1.0"
    const val PREFERENCE = "androidx.preference:preference:1.1.1"
    const val PREFERENCE_V14 = "androidx.legacy:legacy-preference-v14:1.0.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val MULTIDEX = "androidx.multidex:multidex:2.0.1"

    const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.0"
    const val LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.3.0"
    const val LIFE_CYCLE_JAVA_8 = "androidx.lifecycle:lifecycle-common-java8:2.3.0"

    const val NAVIGATION = "androidx.navigation:navigation-fragment-ktx:2.3.3"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:2.3.3"

    const val RX_DATA_BINDINGS = "com.stepango.rxdatabindings:rxdatabindings:2.0.0"
    const val RX_KOTLIN = "io.reactivex.rxjava2:rxkotlin:2.4.0"

    // dagger
    const val DAGGER_HILT = "com.google.dagger:hilt-android:2.35"
    const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-compiler:2.35"

    // annotations
    const val JAVAX_ANNOTATION = "javax.annotation:jsr250-api:1.0"

    const val GLIDE = "com.github.bumptech.glide:glide:4.11.0"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:4.11.0"

    // retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:2.5.0"
    const val RETROFIT_RXJAVA_ADAPTER = "com.squareup.retrofit2:adapter-rxjava2:2.5.0"
    const val OKHTTP_LOG = "com.squareup.okhttp3:logging-interceptor:4.6.0"
    const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:2.5.0"

    const val OKHTTP = "com.squareup.okhttp3:okhttp:4.6.0"

    // rxjava
    const val RX_JAVA = "io.reactivex.rxjava2:rxjava:2.2.8"
    const val RX_ANDROID = "io.reactivex.rxjava2:rxandroid:2.1.1"

    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"

    const val OBJENESIS = "org.objenesis:objenesis:2.6"

    // testing
    const val JUNIT = "junit:junit:4.12"
    const val TEST_CORE = "androidx.test:core:1.0.0"
    const val MOCKITO_CORE = "org.mockito:mockito-core:1.10.19"

    // AndroidJUnitRunner and JUnit Rules
    const val TEST_RUNNER = "androidx.test:runner:1.1.0"
    const val TEST_RULES = "androidx.test:rules:1.1.0"

    // Assertions
    const val TEST_EXT_JUNIT = "androidx.test.ext:junit:1.1.1"
    const val TEST_EXT_TRUTH = "androidx.test.ext:truth:1.0.0"
    const val TEST_GOOGLE_TRUTH = "com.google.truth:truth:0.42"

    // Espresso dependencies
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.1.0"
    const val ESPRESSO_CONTRIB = "androidx.test.espresso:espresso-contrib:3.1.0"
    const val ESPRESSO_INTENTS = "androidx.test.espresso:espresso-intents:3.1.0"
    const val ESPRESSO_IDLING_CONCURRENT = "androidx.test.espresso.idling:idling-concurrent:3.1.0"

    // The following Espresso dependency can be either "implementation"
    // or "androidTestImplementation", depending on whether you want the
    // dependency to appear on your APK's compile classpath or the test APK
    // classpath.
    const val ESPRESSO_IDLING_RESOURCE = "androidx.test.espresso:espresso-idling-resource:3.1.0"

    const val TEST_DAGGER_HILT = "com.google.dagger:hilt-android-testing:2.35"
    const val TEST_DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:2.35"
    const val MOCK_ANDROID = "io.mockk:mockk-android:1.9.3"
    const val MOCK_WEB_SERVER = "com.squareup.okhttp3:mockwebserver:4.6.0"

    const val NAVIGATION_TESTING = "androidx.navigation:navigation-testing:2.3.5"
    const val FRAGMENT_TESTING = "androidx.fragment:fragment-testing:1.3.4"

    const val RX_IDLER = "com.squareup.rx.idler:rx2-idler:0.11.0"
    const val OKHTTP_IDLING_RESOURCE = "com.jakewharton.espresso:okhttp3-idling-resource:1.0.0"
}