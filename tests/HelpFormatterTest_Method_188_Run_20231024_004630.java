package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

class HelpFormatterTest_Method_188_Run_20231024_004630 {

    @Test
    void testGetWidthPositive() {
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getWidth()).thenReturn(10);
        assertEquals(10, formatter.getWidth());
    }

    @Test
    void testGetWidthZero() {
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getWidth()).thenReturn(0);
        assertEquals(0, formatter.getWidth());
    }

    @Test
    void testGetWidthNegative() {
        HelpFormatter formatter = mock(HelpFormatter.class);
        when(formatter.getWidth()).thenReturn(-1);
        assertEquals(-1, formatter.getWidth());
    }
}