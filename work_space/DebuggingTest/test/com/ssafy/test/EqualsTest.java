package com.ssafy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import com.ssafy.equals.Person;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
class EqualsTest {
    @Test
    @Order(1)
    void personEqualsAutoGenerateIDTest() {
        Person p0 = new Person("KimSsafy", 25);
        Person p1 = new Person("KimSsafy", 25);
        assertNotEquals(p0, p1);
    }

    @Test
    @Order(2)
    void personEqualsCustomIDTest() {
        Person p0 = new Person("A0", "KimSsafy", 25);
        Person p1 = new Person("A0", "KimSsafy", 25);
        assertEquals(p0, p1);
    }

    @Test
    @Order(3)
    void personEqualsSetTest() {
        Set<Person> people = new HashSet<>();
        people.add(new Person("KimSsafy", 25));
        people.add(new Person("KimSsafy", 25));
        assertEquals(2, people.size());
    }
}
