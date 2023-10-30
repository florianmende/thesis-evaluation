package org.apache.commons.cli;


import org.junit.Test;

public class OptionTest_Method_91_Run_20231023_204140 {
    @Test
    public void testHasArgName() {
        Option option = new Option("a", true, "This is option a");
        assertFalse(option.hasArgName());
    }

    public static void assertFalse(boolean condition) {
        if (condition) {
            throw new AssertionError("Expected condition to be false, but it was true");
        }
    }
}