package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest_Method_177_Run_20231028_012625 {
    @Test
    void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();

        // Test case 1: The method returns a String of the correct length.
        assertEquals(10, formatter.createPadding(10).length());

        // Test case 2: The method returns a String containing only spaces.
        assertEquals("          ", formatter.createPadding(10));

        // Test case 3: The method returns a String that is not affected by the input String's encoding.
        assertEquals("          ", formatter.createPadding(10));
    }
}