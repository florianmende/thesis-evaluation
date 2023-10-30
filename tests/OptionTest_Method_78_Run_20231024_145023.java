package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_78_Run_20231024_145023 {
    @Test
    public void testGetDescription() {
        // case 1: option has a description
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("description", option.getDescription());

        // case 2: option does not have a description
        option = new Option("a", "arg-name", false, null);
        assertNull(option.getDescription());

        // case 3: option has a null description
        option = new Option("a", "arg-name", true, null);
        assertNull(option.getDescription());
    }
}