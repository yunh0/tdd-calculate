package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("덧셈 : 10 + 20 = 30")
    public void addTest1(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(10, 20);

        assertEquals(rs, 30);
    }

    @Test
    @DisplayName("덧셈 : 1000 + 9000 = 10000")
    public void addTest2(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(1000, 9000);

        assertEquals(rs, 10000);
    }
}
