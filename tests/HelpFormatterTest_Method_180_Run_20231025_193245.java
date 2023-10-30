package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_180_Run_20231025_193245 {
    @Test
    public void testGetDescPaddingPositive() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getDescPadding()).thenReturn(5);

        // Test that the method returns the correct value
        assertEquals(5, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingNegative() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getDescPadding()).thenReturn(-5);

        // Test that the method returns the correct value
        assertEquals(-5, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingZero() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getDescPadding()).thenReturn(0);

        // Test that the method returns the correct value
        assertEquals(0, formatter.getDescPadding());
    }
}