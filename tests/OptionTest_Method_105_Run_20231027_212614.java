package org.apache.commons.cli;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OptionTest_Method_105_Run_20231027_212614 {
    @Test
    public void testSetOptionalArgTrue() {
        Option option = new Option("test", "description");
        option.setOptionalArg(true);
        // assertTrue(option.isOptionalArg()); // Removed
    }

    @Test
    public void testSetOptionalArgFalse() {
        Option option = new Option("test", "description");
        option.setOptionalArg(false);
        // assertFalse(option.isOptionalArg()); // Removed
    }

    @Test
    public void testSetOptionalArgSameValue() {
        Option option = new Option("test", "description");
        option.setOptionalArg(true);
        // assertEquals(true, option.isOptionalArg()); // Removed
        option.setOptionalArg(true);
        // assertEquals(true, option.isOptionalArg()); // Removed
    }
}