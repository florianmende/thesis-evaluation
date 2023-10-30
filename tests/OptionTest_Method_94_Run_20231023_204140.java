package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionTest_Method_94_Run_20231023_204140 {
    @Test
    public void testHasLongOpt() {
        // case 1: the option has a long name
        Option option = new Option("a", "arg-name", true, "description");
        assertTrue(option.hasLongOpt());

        // case 2: the option does not have a long name
        option = new Option("a", null, false, "description");
        assertFalse(option.hasLongOpt());

        // case 3: the option has a null long name
        option = new Option("a", null, false, "description");
        assertFalse(option.hasLongOpt());
    }
}