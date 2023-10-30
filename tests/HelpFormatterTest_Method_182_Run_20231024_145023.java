package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_182_Run_20231024_145023 {

    @Test
    public void testGetLongOptPrefix() {
        // Setup
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");

        // Execute
        String result = formatter.getLongOptPrefix();

        // Verify
        assertEquals("--", result);
    }

    @Test
    public void testGetLongOptPrefixEmptyString() {
        // Setup
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");

        // Execute
        String result = formatter.getLongOptPrefix();

        // Verify
        assertEquals("", result);
    }

    @Test
    public void testGetLongOptPrefixNull() {
        // Setup
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);

        // Execute
        String result = formatter.getLongOptPrefix();

        // Verify
        assertEquals(null, result);
    }
}