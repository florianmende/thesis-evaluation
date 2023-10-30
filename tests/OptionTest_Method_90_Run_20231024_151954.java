package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_90_Run_20231024_151954 {
    @Test
    public void testHasArg_withArgument() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }

    @Test
    public void testHasArg_withoutArgument() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArg()).thenReturn(false);
        assertFalse(option.hasArg());
    }

    @Test
    public void testHasArg_withUnlimitedArguments() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }
}