package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

@MockitoSettings(strictness = Strictness.LENIENT)
public class OptionTest_Method_90_Run_20231024_060930 {

    @Mock
    private Option option;

    @Test
    public void testHasArg_withArgument() {
        when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }

    @Test
    public void testHasArg_withoutArgument() {
        when(option.hasArg()).thenReturn(false);
        assertFalse(option.hasArg());
    }

    @Test
    public void testHasArg_withOptionalArgument() {
        when(option.hasArg()).thenReturn(true);
        when(option.hasArg()).thenReturn(true);
        assertTrue(option.hasArg());
    }
}