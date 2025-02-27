package com.ssafy.test;

import org.junit.jupiter.api.Test;
import com.ssafy.exception.DivideManager;

class UncheckedExceptionTest {
    @Test
    void test() {
        DivideManager manager = new DivideManager();
        manager.divide(0);
    }
}
