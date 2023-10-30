package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelpFormatterTest_Method_177_Run_20231028_042634 {

    @Test
    public void testCreatePadding() {
        HelpFormatter formatter = new HelpFormatter();

        // Test case 1: The method returns a String of the correct length.
        String padding = formatter.createPadding(10);
        assertEquals(10, padding.length());

        // Test case 2: The method returns a String containing only whitespace characters.
        padding = formatter.createPadding(10);
        for (int i = 0; i < padding.length(); i++) {
            assertEquals(' ', padding.charAt(i));
        }

        // Test case 3: The method returns a String that is not null or empty.
        padding = formatter.createPadding(10);
        assertNotNull(padding);
        assertFalse(padding.isEmpty());
    }
}