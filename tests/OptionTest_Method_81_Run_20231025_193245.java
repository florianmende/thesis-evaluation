package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_81_Run_20231025_193245 {
    @Test
    public void testGetLongOpt() {
        // Case 1: When the option has a long name, the method should return the long name.
        Option option = new Option("a", "long-a", false, "description");
        assertEquals("long-a", option.getLongOpt());

        // Case 2: When the option does not have a long name, the method should return null.
        option = new Option("b", null, false, "description");
        assertNull(option.getLongOpt());

        // Case 3: When the option has a long name that is the same as the short name,
        // the method should return the long name.
        option = new Option("c", "c", false, "description");
        assertEquals("c", option.getLongOpt());
    }
}