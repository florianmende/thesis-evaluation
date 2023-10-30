package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.Serializable;

public class HelpFormatterTest_Method_214_Run_20231024_091429 {

    @Test
    public void testSetSyntaxPrefix() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix("test");
        assertEquals("test", helpFormatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixNull() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix(null);
        assertNull(helpFormatter.getSyntaxPrefix());
    }

    @Test
    public void testSetSyntaxPrefixSameValue() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.setSyntaxPrefix("test");
        helpFormatter.setSyntaxPrefix("test");
        assertEquals("test", helpFormatter.getSyntaxPrefix());
    }

    private static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }

    private static void assertNull(String actual) {
        if (actual != null) {
            throw new AssertionError("Expected null, but was: " + actual);
        }
    }
}