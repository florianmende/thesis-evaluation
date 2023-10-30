package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_90_Run_20231025_121248 {

    @Test
    public void testHasArg_noArgRequired() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(false);
        assertFalse(option.hasArg());
    }

    @Test
    public void testHasArg_argRequired() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }

    @Test
    public void testHasArg_optionalArg() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }
}