package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpFormatterTest_Method_188_Run_20231028_042634 {
    @Test
    void testGetWidthPositive() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getWidth()).thenReturn(10);
        assertEquals(10, formatter.getWidth());
    }

    @Test
    void testGetWidthNegative() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getWidth()).thenReturn(-10);
        assertEquals(-10, formatter.getWidth());
    }

    @Test
    void testGetWidthZero() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getWidth()).thenReturn(0);
        assertEquals(0, formatter.getWidth());
    }
}