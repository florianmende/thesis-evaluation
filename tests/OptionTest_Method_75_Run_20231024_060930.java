package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_75_Run_20231024_060930 {
    @Test
    public void testEqualsSameInstance() {
        Option option = new Option("a", "a", false, "a");
        assertTrue(option.equals(option));
    }

    @Test
    public void testEqualsDifferentInstance() {
        Option option1 = new Option("a", "a", false, "a");
        Option option2 = new Option("b", "b", false, "b");
        assertFalse(option1.equals(option2));
    }

    @Test
    public void testEqualsSameOption() {
        Option option1 = new Option("a", "a", false, "a");
        Option option2 = new Option("a", "a", false, "a");
        assertTrue(option1.equals(option2));
    }
}