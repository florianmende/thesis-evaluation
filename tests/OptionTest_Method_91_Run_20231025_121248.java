package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_91_Run_20231025_121248 {
    @Test
    void testHasArgName_NullArgName() {
        Option option = new Option("test", false, "test option");
        option.setArgName(null);
        assertFalse(option.hasArgName());
    }

    @Test
    void testHasArgName_EmptyArgName() {
        Option option = new Option("test", false, "test option");
        option.setArgName("");
        assertFalse(option.hasArgName());
    }

    @Test
    void testHasArgName_NonEmptyArgName() {
        Option option = new Option("test", false, "test option");
        option.setArgName("argName");
        assertTrue(option.hasArgName());
    }
}