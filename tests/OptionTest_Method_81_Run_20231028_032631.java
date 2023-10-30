package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest_Method_81_Run_20231028_032631 {
    @Test
    public void testGetLongOpt() {
        // Case 1: The option has a long name, and the method returns the correct value.
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("arg-name", option.getLongOpt());

        // Case 2: The option does not have a long name, and the method returns null.
        option = new Option("a", null, true, "description");
        assertEquals(null, option.getLongOpt());

        // Case 3: The option's long name is set to an empty string, and the method returns an empty string.
        option = new Option("a", "", true, "description");
        assertEquals("", option.getLongOpt());
    }
}