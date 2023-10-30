package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.apache.commons.cli.Option;

public class OptionTest_Method_83_Run_20231028_042634 {
    @Test
    public void testGetTypeNoArg() {
        Option option = new Option("a", "description");
        Assertions.assertEquals(String.class, option.getType());
    }

    @Test
    public void testGetTypeRequiredArg() {
        Option option = new Option("a", "description", true, "arg-name");
        Assertions.assertEquals(String.class, option.getType());
    }

    @Test
    public void testGetTypeOptionalArg() {
        Option option = new Option("a", "description", false, "arg-name");
        Assertions.assertEquals(String.class, option.getType());
    }
}