package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_180_Run_20231025_215329 {

    @Test
    public void testGetDescPaddingPositive() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        int expected = 10;
        formatter.setDescPadding(expected);

        // Execute
        int actual = formatter.getDescPadding();

        // Verify
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDescPaddingNegative() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        int expected = -10;
        formatter.setDescPadding(expected);

        // Execute
        int actual = formatter.getDescPadding();

        // Verify
        assertEquals(expected, actual);
    }

    @Test
    public void testGetDescPaddingZero() {
        // Set up
        HelpFormatter formatter = new HelpFormatter();
        int expected = 0;
        formatter.setDescPadding(expected);

        // Execute
        int actual = formatter.getDescPadding();

        // Verify
        assertEquals(expected, actual);
    }
}