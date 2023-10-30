package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelpFormatterTest_Method_180_Run_20231025_183916 {
    @Test
    public void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        assertEquals(-10, formatter.getDescPadding());
    }

    @Test
    public void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }
}