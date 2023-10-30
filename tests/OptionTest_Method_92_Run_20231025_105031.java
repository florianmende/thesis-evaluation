package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_92_Run_20231025_105031 {
    @Test
    void testHasArgs() {
        Option option = new Option("a", true, "This option can take multiple values");
        Assertions.assertTrue(option.hasArg());

        option = new Option("a", false, "This option cannot take multiple values");
        Assertions.assertFalse(option.hasArg());

        option = new Option("a", true, "This option is initialized with multiple values");
        Assertions.assertTrue(option.hasArg());
    }
}