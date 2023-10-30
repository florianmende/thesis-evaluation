package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_186_Run_20231026_105918 {
    @Test
    public void testGetOptPrefix() {
        HelpFormatter formatter = new HelpFormatter();
        
        // Test case 1: defaultOptPrefix is set to a non-empty string
        formatter.setOptPrefix("-");
        assertEquals("-", formatter.getOptPrefix());
        
        // Test case 2: defaultOptPrefix is set to an empty string
        formatter.setOptPrefix("");
        assertEquals("", formatter.getOptPrefix());
        
        // Test case 3: defaultOptPrefix is set to null
        formatter.setOptPrefix(null);
        assertNull(formatter.getOptPrefix());
    }
}