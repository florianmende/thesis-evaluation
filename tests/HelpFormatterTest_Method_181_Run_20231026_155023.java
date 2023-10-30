package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_181_Run_20231026_155023 {
    @Test
    public void testGetLeftPaddingDefault() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(2);
        int expected = 2;
        int actual = formatter.getLeftPadding();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLeftPaddingSet() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(4);
        int expected = 4;
        int actual = formatter.getLeftPadding();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetLeftPaddingSetAndReset() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLeftPadding(4);
        formatter.setLeftPadding(2);
        int expected = 2;
        int actual = formatter.getLeftPadding();
        assertEquals(expected, actual);
    }
}