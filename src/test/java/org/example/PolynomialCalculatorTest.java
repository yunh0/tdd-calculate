package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PolynomialCalculatorTest {

    @Test
    @DisplayName("3 + 5")
    void simpleTest(){
        int rs = PolynomialCalculator.run("3 + 5");

        assertThat(rs).isEqualTo(8);
    }

    @Test
    @DisplayName("((3 + 5) * 5 + -10) * 10 / 5 = 60")
    void polynomialCalculationTest(){
        int rs = PolynomialCalculator.run("((3 + 5) * 5 + -10) * 10 / 5");

        assertThat(rs).isEqualTo(60);
    }
}