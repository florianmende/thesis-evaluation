package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_90_Run_20231028_032631 {
    @Test
    public void testHasArg() {
        Option option = Mockito.mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());

        when(option.hasArg()).thenReturn(false);
        assertFalse(option.hasArg());

        when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }
}