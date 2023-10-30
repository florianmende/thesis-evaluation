package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_180_Run_20231030_094427 {
    @Test
    public void testGetDescPadding() {
        // Test case 1: defaultDescPad is a positive integer
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultDescPad = 10;
        assertEquals(10, formatter.getDescPadding());

        // Test case 2: defaultDescPad is a negative integer
        formatter.defaultDescPad = -10;
        assertEquals(-10, formatter.getDescPadding());

        // Test case 3: defaultDescPad is zero
        formatter.defaultDescPad = 0;
        assertEquals(0, formatter.getDescPadding());
    }
}