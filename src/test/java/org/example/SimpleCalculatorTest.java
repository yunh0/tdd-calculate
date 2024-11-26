package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {

    @Test
    @DisplayName("덧셈 : 10 + 20 = 30")
    public void addTest1(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(10, 20);

        // assertEquals(rs, 30);
        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("덧셈 : 1000 + 9000 = 10000")
    public void addTest2(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.plus(1000, 9000);

        // assertEquals(rs, 10000);
        assertThat(rs).isEqualTo(10000);
    }

    @Test
    @DisplayName("뺄셈 : 2000 - 1000 = 1000")
    public void minusTest(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.minus(2000, 1000);

        // assertEquals(rs, 1000);
        assertThat(rs).isEqualTo(1000);
    }

    @Test
    @DisplayName("곱셈 : 50 * 30 = 1500")
    public void multiplyTest(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.multiply(30, 50);

        // assertEquals(rs, 1500);
        assertThat(rs).isEqualTo(1500);
    }

    @Test
    @DisplayName("나눗셈: 16 / 3 = 5")
    public void divideTest(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.divide(16, 3);

        // assertEquals(rs, 5);
        assertThat(rs).isEqualTo(5);
    }

    @Test
    @DisplayName("나머지: 16 / 3 = 1")
    public void reminderTest(){
        SimpleCalculator calculator = new SimpleCalculator();

        int rs = calculator.reminder(16, 3);

        // assertEquals(rs, 1);
        assertThat(rs).isEqualTo(1);
    }
}
