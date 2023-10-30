package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_102_Run_20231024_080105 {
    @Test
    void testSetArgs() {
        Option option = new Option("a", true, "description");
        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());

        option.setArgs(5);
        assertEquals(5, option.getArgs());

        option.setArgs(1);
        assertEquals(1, option.getArgs());
    }
}