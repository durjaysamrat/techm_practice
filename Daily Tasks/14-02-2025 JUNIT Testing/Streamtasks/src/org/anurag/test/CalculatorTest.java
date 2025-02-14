package org.anurag.test;
import org.junit.Assert;
import org.junit.Test;
import org.anurag.Calculator;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calci = new Calculator();
        // when
        int result = calci.sum(2, 2);
        // then
        Assert.assertEquals(4, result);
    }

    @Test
    public void testMinus() {
        Calculator cal = new Calculator();
        Assert.assertEquals(0, cal.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Calculator c1 = new Calculator();
        Assert.assertEquals(2, c1.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator c2 = new Calculator();
        c2.divide(6, 0);
    }
}
