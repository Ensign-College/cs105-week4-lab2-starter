package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateSumTest {

    @Test
    void calculateSumFunction() {
        CalculateSum calculateSum = new CalculateSum(5);
        assertEquals(15, calculateSum.getNum());
    }
}