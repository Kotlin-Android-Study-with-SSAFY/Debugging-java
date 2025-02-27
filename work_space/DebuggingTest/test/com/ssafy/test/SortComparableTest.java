package com.ssafy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.ssafy.collection.SortComparableDebug;

class SortComparableTest {

    @Test
    void sortCarIndexTwoTest() {
        SortComparableDebug debug = new SortComparableDebug();
        debug.sortCars();
        assertEquals(debug.getCarFrom(2).getSpeed(), 250);
    }

    @Test
    void sortCarIndexNineTest() {
        SortComparableDebug debug = new SortComparableDebug();
        debug.sortCars();
        assertEquals(debug.getCarFrom(9).getModel(), "Kia");
    }

}
