package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_181_Run_20231023_204140 {
    @Test
    public void testGetLeftPaddingPositive() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(10);

        // Call the method and check the result
        Assertions.assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingNegative() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(-10);

        // Call the method and check the result
        Assertions.assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingZero() {
        // Set up mock object
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(0);

        // Call the method and check the result
        Assertions.assertEquals(0, formatter.getLeftPadding());
    }
}