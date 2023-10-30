package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_75_Run_20231028_022628 {
    @Test
    public void testEquals_SameObject() {
        Option option = new Option("option", "longOption", true, "description");
        assertTrue(option.equals(option));
    }

    @Test
    public void testEquals_DifferentLongOption() {
        Option option = new Option("option", "longOption", true, "description");
        Option otherOption = mock(Option.class);
        assertFalse(option.equals(otherOption));
    }

    @Test
    public void testEquals_DifferentOption() {
        Option option = new Option("option", "longOption", true, "description");
        Option otherOption = mock(Option.class);
        assertFalse(option.equals(otherOption));
    }
}