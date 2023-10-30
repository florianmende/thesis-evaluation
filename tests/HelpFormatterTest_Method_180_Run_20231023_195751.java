package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelpFormatterTest_Method_180_Run_20231023_195751 {
    @Test
    void testGetDescPaddingPositive() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(10);
        assertEquals(10, formatter.getDescPadding());
    }

    @Test
    void testGetDescPaddingZero() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(0);
        assertEquals(0, formatter.getDescPadding());
    }

    @Test
    void testGetDescPaddingNegative() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setDescPadding(-10);
        assertEquals(-10, formatter.getDescPadding());
    }
}