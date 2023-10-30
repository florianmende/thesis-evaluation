package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.Option;

public class OptionTest_Method_96_Run_20231024_165833 {
    @Test
    public void testHasOptionalArg() {
        Option option = new Option("a", null, false, "");
        assertFalse(option.hasOptionalArg());

        option = new Option("a", null, true, "");
        assertFalse(option.hasOptionalArg());

        option = new Option("a", "arg-name", false, "");
        assertFalse(option.hasOptionalArg());

        option = new Option("a", "arg-name", true, "");
        assertFalse(option.hasOptionalArg());
    }
}