package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_102_Run_20231023_214133 {

    @Test
    public void testSetArgs() {
        Option option = new Option("a", "arg-name", false, "description");
        option.setArgs(1);
        assertEquals(1, option.getArgs());
    }

    // other code...
}