package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_188_Run_20231028_052637 {
    @Test
    public void testGetWidthPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultWidth = 80;
        assertEquals(80, formatter.getWidth());
    }

    @Test
    public void testGetWidthZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultWidth = 0;
        assertEquals(0, formatter.getWidth());
    }

    @Test
    public void testGetWidthNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultWidth = -1;
        assertEquals(-1, formatter.getWidth());
    }

    public void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected " + expected + " but was " + actual);
        }
    }
}