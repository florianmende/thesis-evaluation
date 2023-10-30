package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_96_Run_20231026_155023 {
    @Test
    public void testHasOptionalArg() {
        // Case 1: The option has an optional argument.
        Option option = Mockito.mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());

        // Case 2: The option does not have an optional argument.
        option = Mockito.mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());

        // Case 3: The option has an argument that is not optional.
        option = Mockito.mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());
    }
}