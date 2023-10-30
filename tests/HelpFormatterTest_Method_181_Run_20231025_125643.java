package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_181_Run_20231025_125643 {
    @Test
    public void testGetLeftPadding() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(10);
        Assertions.assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingNegative() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(-10);
        Assertions.assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingZero() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(0);
        Assertions.assertEquals(0, formatter.getLeftPadding());
    }
}