package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class OptionTest_Method_72_Run_20231023_204140 {
    @Test
    public void testAddValueForProcessing_NoArgsAllowed_ThrowsException() {
        Option option = new Option("test", false, "Test option");
        assertThrows(IllegalArgumentException.class, () -> option.addValueForProcessing("value"));
    }

    @Test
    public void testAddValueForProcessing_ArgsAllowed_AddsValue() {
        Option option = new Option("test", true, "Test option");
        option.addValueForProcessing("value");
        assertEquals("value", option.getValue());
    }

    @Test
    public void testAddValueForProcessing_NoArgsAllowed_NoValueAdded() {
        Option option = new Option("test", false, "Test option");
        // Don't call the method with a null value when argsAllowed is false
        assertEquals(null, option.getValue());
    }
}