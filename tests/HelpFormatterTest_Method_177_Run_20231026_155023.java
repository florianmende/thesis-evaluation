package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class HelpFormatterTest_Method_177_Run_20231026_155023 {
    private HelpFormatter formatter = new HelpFormatter();

    @Test
    void testCreatePadding() {
        String padding = formatter.createPadding(10);
        assertEquals(10, padding.length());
        assertEquals("          ", padding);

        padding = formatter.createPadding(5);
        assertEquals(5, padding.length());
        assertEquals("     ", padding);

        padding = formatter.createPadding(0);
        assertEquals(0, padding.length());
        assertEquals("", padding);
    }

    @Test
    void testCreatePaddingWithMock() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.createPadding(10)).thenReturn("          ");
        Mockito.when(formatter.createPadding(5)).thenReturn("     ");
        Mockito.when(formatter.createPadding(0)).thenReturn("");

        String padding = formatter.createPadding(10);
        assertEquals(10, padding.length());
        assertEquals("          ", padding);

        padding = formatter.createPadding(5);
        assertEquals(5, padding.length());
        assertEquals("     ", padding);

        padding = formatter.createPadding(0);
        assertEquals(0, padding.length());
        assertEquals("", padding);
    }
}