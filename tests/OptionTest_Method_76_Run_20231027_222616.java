package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OptionTest_Method_76_Run_20231027_222616 {
    @Test
    public void testGetArgName() {
        Option option = new Option("a", "arg-name", false, "description");

        // Case 1: Option does not have an argument
        assertNull(option.getArgName());

        // Case 2: Option has an argument
        option.setArgName("arg-name");
        assertEquals("arg-name", option.getArgName());

        // Case 3: Option has an argument, but the argument name is not set
        option.setArgName(null);
        assertEquals(null, option.getArgName());
    }
}