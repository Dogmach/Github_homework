package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    @Test
    void assertTrueTest(){
        assertTrue(999 > 111);
    }

    @Test
    void assertFalseTest(){
        assertFalse(1000 > 5000);
    }

    // 1 commit
    // 2 commit
    // 3 commit
}
