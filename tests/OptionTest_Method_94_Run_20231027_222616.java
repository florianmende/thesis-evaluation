package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class OptionTest_Method_94_Run_20231027_222616 {
    @Test
    public void testHasLongOpt() {
        // case 1: option has a long name
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals(true, option.hasLongOpt());

        // case 2: option does not have a long name
        option = new Option("a", null, true, "description");
        assertEquals(false, option.hasLongOpt());

        // case 3: option has a long name and an argument
        option = new Option("a", "arg-name", true, "description");
        assertEquals(true, option.hasLongOpt());
    }
}