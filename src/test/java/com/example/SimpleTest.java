package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.hamcrest.MatcherAssert.assertThat;

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

    @Test
    void assertHamster() {
        Integer intVal = 7;
        assertThat(intVal, allOf(greaterThan(5), lessThanOrEqualTo(7), not(equalTo(6))));
    }

    @Test
    public void givenString_whenConditions_thenCorrect() {
        String string = "Petya";
        assertThat(string, anyOf(containsString("Pet"), endsWith("tya")));
    }



}
