package org.apache.commons.cli;


import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class HelpFormatterTest_Method_183_Run_20231024_145023 {
    private HelpFormatter formatter = new HelpFormatter();

    @Test
    public void testGetLongOptSeparator() {
        // Case 1: The method returns the correct separator when it is set to a non-default value.
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());

        // Case 2: The method returns the default separator when it is not set.
        formatter.setLongOptSeparator(null);
        assertNull(formatter.getLongOptSeparator());

        // Case 3: The method does not throw an exception when the separator is set to null.
        assertDoesNotThrow(() -> formatter.setLongOptSeparator(null));
    }
}