package com.ssafy.test;

import org.junit.jupiter.api.Test;
import com.ssafy.exception.AgeValidator;

class TryCatchTest {

    @Test
    void test() {
        AgeValidator validator = new AgeValidator();
        validator.checkAge(16);
    }

}
