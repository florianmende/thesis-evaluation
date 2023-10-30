package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_188_Run_20231025_121248 {
    @Test
    public void testGetWidthPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultWidth = 10;
        assertEquals(10, formatter.getWidth());
    }

    @Test
    public void testGetWidthNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultWidth = -10;
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testGetWidthZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultWidth = 0;
        assertEquals(0, formatter.getWidth());
    }
}