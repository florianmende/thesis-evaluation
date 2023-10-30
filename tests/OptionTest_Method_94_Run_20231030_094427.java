package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_94_Run_20231030_094427 {
    @Test
    public void testHasLongOpt() {
        Option option = new Option("a", "long-option", false, "description");
        assertEquals(true, option.hasLongOpt());

        option = new Option("a", "long-option", false, "description");
        assertEquals(true, option.hasLongOpt());

        option = new Option("a", "long-option", false, "description");
        assertEquals(true, option.hasLongOpt());
    }
}