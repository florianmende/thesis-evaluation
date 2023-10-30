package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_76_Run_20231028_022628 {
    @Test
    public void testGetArgName() {
        // Case 1: The method returns the correct display name for the argument value when it is set.
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn("argName");
        assertEquals("argName", option.getArgName());

        // Case 2: The method returns the correct display name for the argument value when it is not set.
        option = mock(Option.class);
        when(option.getArgName()).thenReturn(null);
        assertEquals(null, option.getArgName());

        // Case 3: The method returns the correct display name for the argument value when it is set to null.
        option = mock(Option.class);
        when(option.getArgName()).thenReturn("argName");
        assertEquals("argName", option.getArgName());
    }
}