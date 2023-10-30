package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_182_Run_20231027_232619 {
    @Test
    public void testGetLongOptPrefix() {
        // Test case 1: defaultLongOptPrefix is set to a non-empty string
        HelpFormatter formatter = new HelpFormatter();
        formatter.setLongOptPrefix("--");
        assertEquals("--", formatter.getLongOptPrefix());

        // Test case 2: defaultLongOptPrefix is set to an empty string
        formatter = new HelpFormatter();
        formatter.setLongOptPrefix("");
        assertEquals("", formatter.getLongOptPrefix());

        // Test case 3: defaultLongOptPrefix is set to null
        formatter = new HelpFormatter();
        formatter.setLongOptPrefix(null);
        assertNull(formatter.getLongOptPrefix());
    }
}