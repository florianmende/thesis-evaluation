package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelpFormatterTest_Method_177_Run_20231028_032631 {
    @Test
    public void testCreatePadding() {
        // Test case 1: The method creates a String of the correct length.
        HelpFormatter formatter = new HelpFormatter();
        String padding = formatter.createPadding(10);
        assertEquals(10, padding.length());

        // Test case 2: The String contains only spaces.
        assertTrue(padding.matches("^ *$"));

        // Test case 3: The method works correctly for different input lengths.
        padding = formatter.createPadding(5);
        assertEquals(5, padding.length());
        padding = formatter.createPadding(20);
        assertEquals(20, padding.length());
    }
}