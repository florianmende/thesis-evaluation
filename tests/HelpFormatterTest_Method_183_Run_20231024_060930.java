package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.Test;
import junit.framework.TestCase;

public class HelpFormatterTest_Method_183_Run_20231024_060930 extends TestCase {
    @Test
    public void testGetLongOptSeparator() {
        HelpFormatter formatter = new HelpFormatter();

        // Case 1: The method returns the correct separator when it is set to a valid value.
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: The method returns the correct separator when it is set to a null value.
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());

        // Case 3: The method returns the correct separator when it is set to an empty string.
        formatter.setLongOptSeparator("");
        assertEquals("", formatter.getLongOptSeparator());
    }
}