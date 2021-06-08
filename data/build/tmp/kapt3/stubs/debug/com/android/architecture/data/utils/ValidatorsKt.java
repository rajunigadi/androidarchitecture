package com.android.architecture.data.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u00a8\u0006\u0006"}, d2 = {"reverseString", "", "input", "validateCreditCard", "", "creditCardNumber", "data_debug"})
public final class ValidatorsKt {
    
    /**
     * For an explanation of how to validate credit card numbers read:
     *
     * https://www.freeformatter.com/credit-card-number-generator-validator.html#fakeNumbers
     *
     * This contains a breakdown of how this algorithm should work as
     * well as a way to generate fake credit card numbers for testing
     *
     * The structure and signature of this is open to modification, however
     * it *must* include a method, field, etc that returns a [Boolean]
     * indicating if the input is valid or not
     *
     * Additional notes:
     * * This method does not need to validate the credit card issuer
     * * This method must validate card number length (13 - 19 digits), but does not
     *   need to validate the length based on the issuer.
     *
     * @param creditCardNumber - credit card number of (13, 19) digits
     * @return true if a credit card number is believed to be valid,
     * otherwise false
     */
    public static final boolean validateCreditCard(@org.jetbrains.annotations.NotNull()
    java.lang.String creditCardNumber) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String reverseString(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
}