package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_93_Run_20231028_022628 {
    @Test
    public void testHashCode() {
        // Case 1: The hash code value is the same for two Option instances with the same option and longOption values.
        Option option1 = new Option("a", "long-a", true, "description");
        Option option2 = new Option("a", "long-a", true, "description");
        assertEquals(option1.hashCode(), option2.hashCode());

        // Case 2: The hash code value is different for two Option instances with different option values.
        Option option3 = new Option("b", "long-a", true, "description");
        assertNotEquals(option1.hashCode(), option3.hashCode());

        // Case 3: The hash code value is different for two Option instances with different longOption values.
        Option option4 = new Option("a", "long-b", true, "description");
        assertNotEquals(option1.hashCode(), option4.hashCode());
    }
}