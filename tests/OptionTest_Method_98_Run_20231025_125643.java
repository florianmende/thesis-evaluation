package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_98_Run_20231025_125643 {
    @Test
    public void testIsRequired() {
        // case 1: option is required and has an argument
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        when(option.hasArg()).thenReturn(true);
        assertTrue(option.isRequired());

        // case 2: option is not required and has an argument
        option = mock(Option.class);
        when(option.isRequired()).thenReturn(false);
        when(option.hasArg()).thenReturn(true);
        assertFalse(option.isRequired());

        // case 3: option is required and does not have an argument
        option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        when(option.hasArg()).thenReturn(false);
        assertTrue(option.isRequired());
    }
}