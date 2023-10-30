package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_188_Run_20231028_022628 {
    @Test
    public void testGetWidthPositive() {
        // Set up the mock object
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getWidth()).thenReturn(10);

        // Test the method
        assertEquals(10, formatter.getWidth());
    }

    @Test
    public void testGetWidthNegative() {
        // Set up the mock object
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getWidth()).thenReturn(-10);

        // Test the method
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testGetWidthZero() {
        // Set up the mock object
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getWidth()).thenReturn(0);

        // Test the method
        assertEquals(0, formatter.getWidth());
    }
}