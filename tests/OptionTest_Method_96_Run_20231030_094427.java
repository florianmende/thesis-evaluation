package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_96_Run_20231030_094427 {

    @Test
    public void testHasOptionalArg() {
        Option option = mock(Option.class);

        // Case 1: The option has an optional argument
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());

        // Case 2: The option does not have an optional argument
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());

        // Case 3: The option has a required argument
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());
    }
}