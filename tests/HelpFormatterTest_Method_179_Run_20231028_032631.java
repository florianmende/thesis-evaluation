package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelpFormatterTest_Method_179_Run_20231028_032631 {
    @Test
    void testGetArgName() {
        // Test case 1: Test that the method returns the correct value when the defaultArgName field is set to a valid string.
        HelpFormatter formatter = new HelpFormatter();
        formatter.defaultArgName = "arg";
        assertEquals("arg", formatter.getArgName());

        // Test case 2: Test that the method returns the correct value when the defaultArgName field is set to null.
        formatter.defaultArgName = null;
        assertNull(formatter.getArgName());

        // Test case 3: Test that the method returns the correct value when the defaultArgName field is set to an empty string.
        formatter.defaultArgName = "";
        assertEquals("", formatter.getArgName());
    }
}