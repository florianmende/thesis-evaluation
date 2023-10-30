package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_181_Run_20231025_183916 {

    @Test
    public void testGetLeftPaddingPositive() {
        // Setup
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getLeftPadding()).thenReturn(10);

        // Exercise
        int result = formatter.getLeftPadding();

        // Verify
        assertEquals(10, result);
    }

    @Test
    public void testGetLeftPaddingNegative() {
        // Setup
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getLeftPadding()).thenReturn(-10);

        // Exercise
        int result = formatter.getLeftPadding();

        // Verify
        assertEquals(-10, result);
    }

    @Test
    public void testGetLeftPaddingZero() {
        // Setup
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getLeftPadding()).thenReturn(0);

        // Exercise
        int result = formatter.getLeftPadding();

        // Verify
        assertEquals(0, result);
    }
}