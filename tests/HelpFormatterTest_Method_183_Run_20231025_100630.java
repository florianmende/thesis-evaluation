package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_183_Run_20231025_100630 {
    @Test
    public void testGetLongOptSeparator() {
        // Test that the method returns the correct separator when it is set to a valid value.
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Test that the method returns the correct separator when it is set to null.
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());

        // Test that the method returns the correct separator when it is set to an empty string.
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());
    }
}