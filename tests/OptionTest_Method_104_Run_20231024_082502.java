package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_104_Run_20231024_082502 {
    @Test
    public void testSetLongOpt() {
        Option option = new Option("testOption", "This is a test option");

        // Test case 1: Call setLongOpt with a valid string argument
        option.setLongOpt("testLongOpt");
        assertEquals("testLongOpt", option.getLongOpt());

        // Test case 2: Call setLongOpt with a null argument
        option.setLongOpt(null);
        assertNull(option.getLongOpt());

        // Test case 3: Call setLongOpt with an empty string argument
        option.setLongOpt("");
        assertEquals("", option.getLongOpt());
    }
}