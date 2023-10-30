package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_211_Run_20231024_080105 {
    @Test
    public void testSetNewLine() {
        // Test that the "defaultNewLine" field is set to the correct value when the "setNewLine" method is called with a valid String argument.
        HelpFormatter formatter = new HelpFormatter();
        String newline = "newline";
        formatter.setNewLine(newline);
        assertEquals(newline, formatter.getNewLine());

        // Test that the "defaultNewLine" field is not changed when the "setNewLine" method is called with a null argument.
        formatter = new HelpFormatter();
        formatter.setNewLine("");
        assertEquals("", formatter.getNewLine());

        // Test that the "defaultNewLine" field is not changed when the "setNewLine" method is called with an empty String argument.
        formatter = new HelpFormatter();
        formatter.setNewLine("");
        assertEquals("", formatter.getNewLine());
    }

    private void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected <" + expected + "> but was <" + actual + ">");
        }
    }
}