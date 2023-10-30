package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_186_Run_20231025_183916 {

    @Test
    public void testGetOptPrefix() {
        // Test that the method returns the correct value when the "defaultOptPrefix" field is set to a non-empty String
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultOptPrefix = "-";
        assertEquals("-", formatter.getOptPrefix());

        // Test that the method returns the correct value when the "defaultOptPrefix" field is set to an empty String
        formatter = new HelpFormatter();
        formatter.defaultOptPrefix = "";
        assertEquals("", formatter.getOptPrefix());

        // Test that the method returns the correct value when the "defaultOptPrefix" field is set to null
        formatter = new HelpFormatter();
        formatter.defaultOptPrefix = null;
        assertEquals(null, formatter.getOptPrefix());
    }
}