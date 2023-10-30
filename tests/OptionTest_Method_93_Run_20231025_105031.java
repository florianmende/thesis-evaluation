package org.apache.commons.cli;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_93_Run_20231025_105031 {
    @Test
    public void testHashCode() {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("a", "arg-name", true, "description");
        Assertions.assertEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    public void testHashCode_differentProperties() {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("b", "arg-name", true, "description");
        Assertions.assertNotEquals(option1.hashCode(), option2.hashCode());
    }

    @Test
    public void testHashCode_differentArgumentCounts() {
        Option option1 = new Option("a", "arg-name", true, "description");
        Option option2 = new Option("a", "arg-name", false, "description");
        Assertions.assertEquals(option1.hashCode(), option2.hashCode());
    }
}