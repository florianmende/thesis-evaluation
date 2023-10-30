package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_81_Run_20231023_204140 {
    @Test
    public void testGetLongOpt() {
        Option option = new Option("a", "long-a", true, "description");
        assertEquals("long-a", option.getLongOpt());

        option = new Option("a", null, true, "description");
        assertNull(option.getLongOpt());

        option = new Option("a", "a", true, "description");
        assertEquals("a", option.getLongOpt());
    }
}