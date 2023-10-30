package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest_Method_179_Run_20231025_125643 {
    @Test
    void testGetArgName() {
        // Case 1: defaultArgName is set to a non-null value
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultArgName = "argName";
        assertEquals("argName", formatter.getArgName());

        // Case 2: defaultArgName is set to null
        formatter = new HelpFormatter();
        formatter.defaultArgName = null;
        assertNull(formatter.getArgName());

        // Case 3: defaultArgName is not set (i.e., it is null)
        formatter = new HelpFormatter();
        formatter.defaultArgName = "";
        assertEquals("", formatter.getArgName());
    }
}