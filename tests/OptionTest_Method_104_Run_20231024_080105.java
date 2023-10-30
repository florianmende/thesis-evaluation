package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_104_Run_20231024_080105 {

    @Test
    public void testSetLongOpt() {
        Option option = new Option("a", "arg-name", false, "description");

        // Test case 1: Set long option to null
        option.setLongOpt(null);
        assertEquals(null, option.getLongOpt());

        // Test case 2: Set long option to empty string
        option.setLongOpt("");
        assertEquals("", option.getLongOpt());

        // Test case 3: Set long option to a valid string
        option.setLongOpt("long-opt");
        assertEquals("long-opt", option.getLongOpt());
    }
}