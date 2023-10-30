package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class HelpFormatterTest_Method_188_Run_20231025_100630 {

    @Mock
    private HelpFormatter helpFormatter;

    @Test
    public void testGetWidthPositive() {
        // Setup
        int expectedWidth = 80;
        when(helpFormatter.getWidth()).thenReturn(expectedWidth);

        // Exercise
        int actualWidth = helpFormatter.getWidth();

        // Verify
        assertEquals(expectedWidth, actualWidth);
    }

    @Test
    public void testGetWidthZero() {
        // Setup
        int expectedWidth = 0;
        when(helpFormatter.getWidth()).thenReturn(expectedWidth);

        // Exercise
        int actualWidth = helpFormatter.getWidth();

        // Verify
        assertEquals(expectedWidth, actualWidth);
    }

    @Test
    public void testGetWidthNegative() {
        // Setup
        int expectedWidth = -1;
        when(helpFormatter.getWidth()).thenReturn(expectedWidth);

        // Exercise
        int actualWidth = helpFormatter.getWidth();

        // Verify
        assertEquals(expectedWidth, actualWidth);
    }
}