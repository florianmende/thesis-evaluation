package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OptionTest_Method_81_Run_20231025_121248 {
    @Test
    public void testGetLongOpt_HasLongName() {
        Option option = new Option("a", "arg-name", false, "description");
        assertEquals("arg-name", option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_NoLongName() {
        Option option = new Option("a", false, "description");
        assertEquals(null, option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_LongNameNotSpecified() {
        Option option = new Option("a", "description");
        assertEquals(null, option.getLongOpt());
    }
}