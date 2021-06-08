package com.android.architecture

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    ApiTest::class,
    CreditCardValidatorTest::class
)
class UnitTestSuite