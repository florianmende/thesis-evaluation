package org.apache.commons.cli;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.HelpFormatter;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_188_Run_20231024_080105 {
    private HelpFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = Mockito.mock(HelpFormatter.class);
    }

    @Test
    void testGetWidthPositive() {
        int defaultWidth = 10;
        Mockito.doReturn(defaultWidth).when(formatter).getWidth();
        Assertions.assertEquals(defaultWidth, formatter.getWidth());
    }

    @Test
    void testGetWidthNegative() {
        int defaultWidth = -10;
        Mockito.doReturn(defaultWidth).when(formatter).getWidth();
        Assertions.assertEquals(defaultWidth, formatter.getWidth());
    }

    @Test
    void testGetWidthZero() {
        int defaultWidth = 0;
        Mockito.doReturn(defaultWidth).when(formatter).getWidth();
        Assertions.assertEquals(defaultWidth, formatter.getWidth());
    }
}