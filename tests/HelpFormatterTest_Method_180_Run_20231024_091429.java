package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_180_Run_20231024_091429 {
    @Test
    public void testGetDescPadding() {
        // Set up mock objects
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getDescPadding()).thenReturn(10);

        // Test case 1: Positive value
        assertEquals(10, formatter.getDescPadding());

        // Test case 2: Negative value
        Mockito.when(formatter.getDescPadding()).thenReturn(-10);
        assertEquals(-10, formatter.getDescPadding());

        // Test case 3: Zero value
        Mockito.when(formatter.getDescPadding()).thenReturn(0);
        assertEquals(0, formatter.getDescPadding());
    }
}