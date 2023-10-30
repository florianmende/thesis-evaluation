package org.apache.commons.cli;


import static org.junit.Assert.*;
import org.junit.Test;

public class OptionTest_Method_82_Run_20231025_121248 {
    @Test
    public void testGetOpt() {
        // case 1: the method returns the correct name of the option when the option is set
        Option option = new Option("a", "arg-name", false, "description");
        assertEquals("a", option.getOpt());

        // case 2: the method returns null when the option is not set
        option = new Option(null, "arg-name", false, "description");
        assertNull(option.getOpt());

        // case 3: the method returns the correct name of the option when the option is set to null
        option = new Option("a", null, false, "description");
        assertEquals("a", option.getOpt());
    }
}