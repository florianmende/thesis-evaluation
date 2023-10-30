package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OptionTest_Method_82_Run_20231024_165833 {
    @Test
    public void testGetOpt() {
        Option option = new Option("a", "arg-name", true, "description");
        assertEquals("a", option.getOpt());
    }

    @Test
    public void testGetOptWithNoOpt() {
        Option option = new Option(null, "arg-name", true, "description");
        assertNull(option.getOpt());
    }

    @Test
    public void testGetOptWithEmptyOpt() {
        Option option = new Option("", "arg-name", true, "description");
        assertEquals("", option.getOpt());
    }
}