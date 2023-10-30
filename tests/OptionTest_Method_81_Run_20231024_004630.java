package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_81_Run_20231024_004630 {
    @Test
    public void testGetLongOpt() {
        // Test case 1: Option has long name
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("arg-name", option.getLongOpt());

        // Test case 2: Option does not have long name
        option = new Option("a", null, true, "description");
        assertNull(option.getLongOpt());

        // Test case 3: Option has both short and long name
        option = new Option("a", "arg-name", true, "description");
        assertEquals("arg-name", option.getLongOpt());
    }
}