package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_184_Run_20231024_145023 {
    @Test
    public void testGetNewLine() {
        HelpFormatter formatter = new HelpFormatter();

        // Test that the method returns the correct value when the defaultNewLine field is set to a non-empty string.
        formatter.defaultNewLine = "Test";
        assertEquals("Test", formatter.getNewLine());

        // Test that the method returns the correct value when the defaultNewLine field is set to an empty string.
        formatter.defaultNewLine = "";
        assertEquals("", formatter.getNewLine());

        // Test that the method returns the correct value when the defaultNewLine field is set to null.
        formatter.defaultNewLine = null;
        assertEquals(null, formatter.getNewLine());
    }
}