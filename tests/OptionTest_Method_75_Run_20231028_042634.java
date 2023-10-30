package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_75_Run_20231028_042634 {
    @Test
    public void testEqualsWithSameObject() {
        Option option = new Option("test", "test option");
        assertTrue(option.equals(option));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        Option option = new Option("test", "test option");
        String other = "test";
        assertFalse(option.equals(other));
    }

    @Test
    public void testEqualsWithSameValues() {
        Option option1 = new Option("test", "test option");
        Option option2 = new Option("test", "test option");
        assertTrue(option1.equals(option2));
    }
}