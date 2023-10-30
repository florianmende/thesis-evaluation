package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class OptionTest_Method_72_Run_20231024_165833 {
    @Test
    public void testAddValueForProcessing_NotInitialized() {
        Option option = new Option("test", false, "");
        assertThrows(IllegalArgumentException.class, () -> option.addValueForProcessing("test"));
    }

    @Test
    public void testAddValueForProcessing_NullValue() {
        Option option = new Option("test", true, "");
        option.addValueForProcessing(null);
        assertEquals(null, option.getValue());
    }

    @Test
    public void testAddValueForProcessing_NonNullValue() {
        Option option = new Option("test", true, "");
        option.addValueForProcessing("value");
        assertEquals("value", option.getValue());
    }
}