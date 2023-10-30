package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.Test;
import static org.junit.Assert.*;

public class OptionTest_Method_81_Run_20231027_222616 {
    @Test
    public void testGetLongOpt() {
        Option option = new Option("a", "arg-name", false, "description");
        assertEquals("arg-name", option.getLongOpt());

        option = new Option("b", false, "description");
        assertNull(option.getLongOpt());

        option = new Option("c", "c", false, "description");
        assertEquals("c", option.getLongOpt());
    }
}