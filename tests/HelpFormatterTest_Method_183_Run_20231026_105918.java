package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_183_Run_20231026_105918 {
    @Test
    void testGetLongOptSeparator() {
        // Case 1: non-empty string
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: empty string
        formatter = new HelpFormatter();
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());

        // Case 3: null
        formatter = new HelpFormatter();
        formatter.setLongOptSeparator(null);
        assertEquals(null, formatter.getLongOptSeparator());
    }
}