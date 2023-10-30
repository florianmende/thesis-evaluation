package org.apache.commons.cli;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HelpFormatterTest_Method_188_Run_20231030_094427 {

    @Mock
    private HelpFormatter formatter;

    @Test
    public void testGetWidthPositive() {
        when(formatter.getWidth()).thenReturn(10);
        assertEquals(10, formatter.getWidth());
    }

    @Test
    public void testGetWidthZero() {
        when(formatter.getWidth()).thenReturn(0);
        assertEquals(0, formatter.getWidth());
    }

    @Test
    public void testGetWidthNegative() {
        when(formatter.getWidth()).thenReturn(-10);
        assertEquals(-10, formatter.getWidth());
    }
}