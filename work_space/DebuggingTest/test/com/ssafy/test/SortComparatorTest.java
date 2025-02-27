package com.ssafy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.ssafy.collection.Car;
import com.ssafy.collection.SortComparatorDebug;

class SortComparatorTest {

    @Test
    void sortCarTest() {
        SortComparatorDebug debug = new SortComparatorDebug();
        Car c = debug.getCarFromQueue();
        assertEquals(c.getPrice(), 200000);
        c = debug.getCarFromQueue();
        assertEquals(c.getModel(), "Lamborghini");
        c = debug.getCarFromQueue();
        assertEquals(c.getSpeed(), 230);
    }
}
