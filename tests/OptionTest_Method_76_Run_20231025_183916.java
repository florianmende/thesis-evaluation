package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OptionTest_Method_76_Run_20231025_183916 {
    @Test
    public void testGetArgName_ArgumentName() {
        // Setup
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn("argName");

        // Execute
        String result = option.getArgName();

        // Verify
        assertEquals("argName", result);
    }

    @Test
    public void testGetArgName_NoArgumentName() {
        // Setup
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn(null);

        // Execute
        String result = option.getArgName();

        // Verify
        assertEquals(null, result);
    }

    @Test
    public void testGetArgName_EmptyArgumentName() {
        // Setup
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn("");

        // Execute
        String result = option.getArgName();

        // Verify
        assertEquals("", result);
    }
}