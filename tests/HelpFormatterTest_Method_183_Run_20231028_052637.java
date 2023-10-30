package org.apache.commons.cli;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_183_Run_20231028_052637 {
    @Test
    public void testGetLongOptSeparator() {
        // Set up a HelpFormatter object with a custom long option separator
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptSeparator("=");

        // Test that the method returns the correct separator when it is set
        Assertions.assertEquals("=", formatter.getLongOptSeparator());

        // Test that the method returns null when the long option separator is not set
        formatter.setLongOptSeparator(null);
        Assertions.assertEquals(null, formatter.getLongOptSeparator());

        // Test that the method returns the correct separator when it is set to a custom value
        formatter.setLongOptSeparator(":");
        Assertions.assertEquals(":", formatter.getLongOptSeparator());
    }
}