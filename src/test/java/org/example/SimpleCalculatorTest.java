package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("덧셈 : 10 + 20 = 30")
    public void t1(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(10, 20);

        assertEquals(rs, 30);
    }
}
