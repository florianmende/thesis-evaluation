package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_105_Run_20231025_224954 {
    @Test
    public void testSetOptionalArg() {
        Option option = new Option("a", false, "description");

        // Case 1: Setting the optional argument property to true when it is currently false.
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());

        // Case 2: Setting the optional argument property to false when it is currently true.
        option.setOptionalArg(false);
        assertFalse(option.hasOptionalArg());

        // Case 3: Setting the optional argument property to the same value as it currently has.
        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());
    }
}