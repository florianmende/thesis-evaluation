package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_98_Run_20231025_215329 {
    @Test
    public void testIsRequired_mandatory() {
        Option option = new Option("a", "arg-name", true, "description");
        assertFalse(option.isRequired());
    }

    @Test
    public void testIsRequired_notMandatory() {
        Option option = new Option("a", "arg-name", false, "description");
        assertFalse(option.isRequired());
    }

    @Test
    public void testIsRequired_null() {
        Option option = new Option("a", "arg-name", false, "description");
        assertFalse(option.isRequired());
    }
}