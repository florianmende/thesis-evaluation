package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import java.io.IOException;

public class HelpFormatterTest_Method_188_Run_20231027_232619 {
    @Test
    public void testGetWidthPositive() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getWidth()).thenReturn(10);

        // Test the method
        Assertions.assertEquals(10, formatter.getWidth());
    }

    @Test
    public void testGetWidthNegative() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getWidth()).thenReturn(-10);

        // Test the method
        Assertions.assertEquals(-10, formatter.getWidth());
    }

    @Test
    public void testGetWidthZero() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getWidth()).thenReturn(0);

        // Test the method
        Assertions.assertEquals(0, formatter.getWidth());
    }
}