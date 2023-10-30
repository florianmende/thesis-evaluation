package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class OptionTest_Method_90_Run_20231027_232619 {
    @Test
    void testHasArg_WithArgument() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        assertEquals(true, option.hasArg());
    }

    @Test
    void testHasArg_WithoutArgument() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(false);
        assertEquals(false, option.hasArg());
    }

    @Test
    void testHasArg_WithOptionalArgument() {
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        assertEquals(true, option.hasArg());
    }
}