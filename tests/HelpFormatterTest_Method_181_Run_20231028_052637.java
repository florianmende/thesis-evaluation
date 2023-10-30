package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Assertions;

public class HelpFormatterTest_Method_181_Run_20231028_052637 {
    @Test
    public void testGetLeftPadding() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLeftPadding()).thenReturn(5);
        Assertions.assertEquals(5, formatter.getLeftPadding());
        Mockito.when(formatter.getLeftPadding()).thenReturn(-5);
        Assertions.assertEquals(-5, formatter.getLeftPadding());
        Mockito.when(formatter.getLeftPadding()).thenReturn(0);
        Assertions.assertEquals(0, formatter.getLeftPadding());
    }
}