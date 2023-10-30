package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_96_Run_20231025_183916 {
    @Test
    public void testHasOptionalArg() {
        Option option = mock(Option.class);

        // Case 1: The option does not take an argument.
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());

        // Case 2: The option takes a required argument.
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());

        // Case 3: The option takes an optional argument.
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());
    }
}