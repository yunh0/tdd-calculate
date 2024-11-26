package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PolynomialCalculatorTest {

    @Test
    @DisplayName("3 + 5")
    void test1(){
        int rs = PolynomialCalculator.run("3 + 5");

        assertThat(rs).isEqualTo(8);
    }
}