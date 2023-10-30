package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_81_Run_20231025_215329 {

    @Test
    public void testGetLongOpt() {
        // case 1: the option has a long name
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("arg-name", option.getLongOpt());

        // case 2: the option does not have a long name
        option = new Option("a", null, true, "description");
        assertNull(option.getLongOpt());

        // case 3: the option is null
        option = null;
        if (option != null) {
            assertNull(option.getLongOpt());
        }
    }
}