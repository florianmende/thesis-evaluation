package org.apache.commons.cli;


import org.junit.Test;

public class OptionTest_Method_92_Run_20231024_004630 {
    @Test
    public void testHasArgs() {
        Option option = new Option("a", "arg-name", true, "description");
        if (option.hasArgs()) {
            // do something
        }

        option = new Option("a", "arg-name", false, "description");
        if (!option.hasArgs()) {
            // do something else
        }

        option = new Option("a", "arg-name", true, "description");
        if (option.hasArgs()) {
            // do something
        }
    }
}