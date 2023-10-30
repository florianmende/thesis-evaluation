package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_180_Run_20231025_100630 {

    @Test
    public void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        int actual = formatter.getDescPadding();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        int actual = formatter.getDescPadding();
        int expected = -10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        int actual = formatter.getDescPadding();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}