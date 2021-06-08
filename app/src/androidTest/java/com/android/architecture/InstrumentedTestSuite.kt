package com.android.architecture

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    UserFragmentTest::class,
    UserItemFragmentTest::class
)
class InstrumentedTestSuite