package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_180_Run_20231028_032631 {
    @Test
    public void testGetDescPaddingPositive() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        int defaultDescPad = 2;
        formatter.setDescPadding(defaultDescPad); // Change 1: Use setDescPadding instead of setDefaultDescPad

        // Expected value
        int expected = defaultDescPad;

        // Actual value
        int actual = formatter.getDescPadding();

        // Assertion
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetDescPaddingNegative() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        int defaultDescPad = -2;
        formatter.setDescPadding(defaultDescPad); // Change 2: Use setDescPadding instead of setDefaultDescPad

        // Expected value
        int expected = defaultDescPad;

        // Actual value
        int actual = formatter.getDescPadding();

        // Assertion
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetDescPaddingZero() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        int defaultDescPad = 0;
        formatter.setDescPadding(defaultDescPad); // Change 3: Use setDescPadding instead of setDefaultDescPad

        // Expected value
        int expected = defaultDescPad;

        // Actual value
        int actual = formatter.getDescPadding();

        // Assertion
        Assertions.assertEquals(expected, actual);
    }
}