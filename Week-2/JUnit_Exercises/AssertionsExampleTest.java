package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTest {

    AssertionsExample obj = new AssertionsExample();

    @Test
    void testAssertEquals() {
        assertEquals(10, obj.add(5, 5));
    }

    @Test
    void testAssertTrue() {
        assertTrue(obj.isAdult(20));
    }

    @Test
    void testAssertFalse() {
        assertFalse(obj.isAdult(15));
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(obj.getName());
    }

    @Test
    void testAssertNull() {
        assertNull(obj.getNullValue());
    }
}
