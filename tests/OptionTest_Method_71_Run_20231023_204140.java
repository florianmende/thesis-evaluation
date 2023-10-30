package org.apache.commons.cli;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OptionTest_Method_71_Run_20231023_204140 {

    @Test
    public void testValidOption() {
        Option option = new Option("a", "description");
        Assertions.assertEquals("a", option.getOpt());
        Assertions.assertEquals("description", option.getDescription());
        Assertions.assertFalse(option.hasArg());
        //Assertions.assertEquals(Option.UNINITIALIZED, option.getArgCount());
        Assertions.assertEquals(String.class, option.getType());
        Assertions.assertNull(option.getLongOpt());
        Assertions.assertNull(option.getArgName());
    }

    @Test
    public void testInvalidOption() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Option("a b", "description");
        });
    }
}