package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_98_Run_20231024_080105 {
    @Test
    public void testIsRequired() {
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        assertTrue(option.isRequired());

        option = mock(Option.class);
        when(option.isRequired()).thenReturn(false);
        assertFalse(option.isRequired());

        option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        when(option.hasArg()).thenReturn(true);
        when(option.getArgName()).thenReturn("arg");
        assertTrue(option.isRequired());
    }
}