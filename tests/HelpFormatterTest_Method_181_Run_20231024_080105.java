package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_181_Run_20231024_080105 {
    @Test
    public void testGetLeftPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(10);
        assertEquals(10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(-10);
        assertEquals(-10, formatter.getLeftPadding());
    }

    @Test
    public void testGetLeftPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(0);
        assertEquals(0, formatter.getLeftPadding());
    }
}