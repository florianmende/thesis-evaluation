package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.PrintWriter;
import java.util.List;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_181_Run_20231024_060930 {
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