package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_181_Run_20231025_105031 {
    @Test
    public void testGetLeftPaddingPositive() {
        // Set up mock objects
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getLeftPadding()).thenReturn(10);

        // Call the method and assert the result
        assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingNegative() {
        // Set up mock objects
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getLeftPadding()).thenReturn(-10);

        // Call the method and assert the result
        assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingZero() {
        // Set up mock objects
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getLeftPadding()).thenReturn(0);

        // Call the method and assert the result
        assertEquals(0, formatter.getLeftPadding());
    }
}