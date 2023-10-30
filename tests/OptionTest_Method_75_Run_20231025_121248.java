package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_75_Run_20231025_121248 {
    @Test
    public void testEquals() {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("a", "arg-name", true, "description");
        assertEquals(option1, option2);

        Option option3 = new Option("b", "arg-name", true, "description");
        assertNotEquals(option1, option3);

        Option option4 = new Option("a", "arg-name2", true, "description");
        assertNotEquals(option1, option4);
    }
}