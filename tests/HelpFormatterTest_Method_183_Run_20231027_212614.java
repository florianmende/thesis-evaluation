package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class HelpFormatterTest_Method_183_Run_20231027_212614 {

    @Test
    void testGetLongOptSeparatorNonDefault() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        String separator = formatter.getLongOptSeparator();
        assertEquals("=", separator);
    }

    @Test
    void testGetLongOptSeparatorDefault() {
        HelpFormatter formatter = new HelpFormatter();
        String separator = formatter.getLongOptSeparator();
        assertEquals(" ", separator);
    }

    @Test
    void testGetLongOptSeparatorDefaultWithMock() {
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLongOptSeparator()).thenReturn("=");
        String separator = formatter.getLongOptSeparator();
        assertEquals("=", separator);
    }
}