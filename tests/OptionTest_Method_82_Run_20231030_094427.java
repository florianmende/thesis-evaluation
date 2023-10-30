package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OptionTest_Method_82_Run_20231030_094427 {
    @Test
    public void testGetOpt_ShortName() {
        // Set up the mock object
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("-a");

        // Test the method
        String result = option.getOpt();
        assertEquals("-a", result);
    }

    @Test
    public void testGetOpt_LongName() {
        // Set up the mock object
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("--arg-name");

        // Test the method
        String result = option.getOpt();
        assertEquals("--arg-name", result);
    }

    @Test
    public void testGetOpt_BothNames() {
        // Set up the mock object
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getOpt()).thenReturn("-a");

        // Test the method
        String result = option.getOpt();
        assertEquals("-a", result);
    }
}