package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionTest_Method_76_Run_20231025_125643 {
    @Test
    public void testGetArgName() {
        // Case 1: The option has an argument, and the argument name is set
        Option option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        when(option.getArgName()).thenReturn("argName");
        assertEquals("argName", option.getArgName());

        // Case 2: The option has an argument, but the argument name is not set
        option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        when(option.getArgName()).thenReturn("");
        assertEquals("", option.getArgName());

        // Case 3: The option does not have an argument
        option = mock(Option.class);
        when(option.hasArg()).thenReturn(false);
        assertEquals(null, option.getArgName());
    }
}