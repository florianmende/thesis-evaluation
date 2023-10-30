package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class OptionTest_Method_102_Run_20231024_004630 {
    @Test
    public void testSetArgs() {
        Option option = new Option("a", "arg-name", false, "This is a test option");
        option.setArgs(1);
        assertEquals(1, option.getArgs());
        option.setArgs(1);
        assertEquals(1, option.getArgs());
        option.setArgs(0);
        assertEquals(0, option.getArgs());
        option.setArgs(1);
        assertEquals(1, option.getArgs());
    }
}