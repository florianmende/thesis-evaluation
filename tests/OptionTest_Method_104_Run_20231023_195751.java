package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class OptionTest_Method_104_Run_20231023_195751 {
    @Test
    public void testSetLongOpt() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setLongOpt("long-option");
        assertEquals("long-option", option.getLongOpt());
    }

    @Test
    public void testSetLongOptNull() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setLongOpt(null);
        assertNull(option.getLongOpt());
    }

    @Test
    public void testSetLongOptEmptyString() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setLongOpt("");
        assertEquals("", option.getLongOpt());
    }
}