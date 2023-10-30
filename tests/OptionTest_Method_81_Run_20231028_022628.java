package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.apache.commons.cli.Option;

public class OptionTest_Method_81_Run_20231028_022628 {
    @Test
    public void testGetLongOpt_HasLongName() {
        // create an Option with a long name
        Option option = new Option("a", "arg-name", true, "description");
        // test that the method returns the long name
        assertEquals("arg-name", option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_NoLongName() {
        // create an Option without a long name
        Option option = new Option("a", false, "description");
        // test that the method returns null
        assertNull(option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_LongNameSameAsShortName() {
        // create an Option with a long name that is the same as the short name
        Option option = new Option("a", "a", true, "description");
        // test that the method returns the long name
        assertEquals("a", option.getLongOpt());
    }
}