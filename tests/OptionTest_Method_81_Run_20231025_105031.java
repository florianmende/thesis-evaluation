package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_81_Run_20231025_105031 {
    @Test
    public void testGetLongOptWithLongName() {
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("arg-name", option.getLongOpt());
    }

    @Test
    public void testGetLongOptWithoutLongName() {
        Option option = new Option("a", "description");
        assertNull(option.getLongOpt());
    }
}