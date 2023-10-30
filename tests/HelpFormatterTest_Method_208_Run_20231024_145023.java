package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_208_Run_20231024_145023 {
    @Test
    public void testSetLeftPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(10);
        assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    public void testSetLeftPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(-10);
        assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    public void testSetLeftPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }
}