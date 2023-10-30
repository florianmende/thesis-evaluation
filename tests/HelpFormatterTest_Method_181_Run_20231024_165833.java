package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_181_Run_20231024_165833 {
    @Test
    public void testGetLeftPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultLeftPad = 5;
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultLeftPad = -5;
        assertEquals(-5, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultLeftPad = 0;
        assertEquals(0, formatter.getLeftPadding());
    }
}