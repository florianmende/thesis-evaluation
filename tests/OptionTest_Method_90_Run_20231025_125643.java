package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_90_Run_20231025_125643 {

    @Test
    public void testHasArgWithNoArguments() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(false);
        assertFalse(option.hasArg());
    }

    @Test
    public void testHasArgWithOneArgument() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }

    @Test
    public void testHasArgWithUnlimitedArguments() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);
        assertTrue(option.hasArg());
    }
}