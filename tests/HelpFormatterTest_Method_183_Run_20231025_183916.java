package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class HelpFormatterTest_Method_183_Run_20231025_183916 {
    @Test
    public void testGetLongOptSeparator() {
        // Set up a mock HelpFormatter instance
        HelpFormatter formatter = Mockito.mock(HelpFormatter.class);
        Mockito.when(formatter.getLongOptSeparator()).thenReturn(":");

        // Test case 1: long option and value separated by a space
        String separator = formatter.getLongOptSeparator();
        assertEquals(":", separator);

        // Test case 2: long option and value separated by an equals sign
        separator = formatter.getLongOptSeparator();
        assertEquals(":", separator);

        // Test case 3: long option and value separated by a colon
        separator = formatter.getLongOptSeparator();
        assertEquals(":", separator);
    }

    private void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }
}