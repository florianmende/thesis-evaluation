package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_81_Run_20231025_183916 {
    @Test
    public void testGetLongOpt() {
        Option option = new Option("a", "arg-name", true, "This is a test option");
        assertEquals("arg-name", option.getLongOpt());

        option = new Option("b", null, true, "This is another test option");
        assertEquals(null, option.getLongOpt());

        option = new Option("c", "", true, "This is a test option with an empty long name");
        assertEquals("", option.getLongOpt());
    }
}