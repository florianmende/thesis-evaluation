package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class OptionTest_Method_94_Run_20231025_193245 {

    @InjectMocks
    private Option option;

    @Mock
    private Option mockOption = mock(Option.class);

    @Test
    public void testHasLongOpt() {
        // Test case 1: The option has a long name.
        option = new Option("a", "arg-name", true, "description");
        assertTrue(option.hasLongOpt());

        // Test case 2: The option does not have a long name.
        option = new Option("a", null, true, "description");
        assertFalse(option.hasLongOpt());

        // Test case 3: The option has a null long name.
        option = new Option("a", null, true, "description");
        assertFalse(option.hasLongOpt());
    }

    @Test
    public void testHasLongOptWithMockito() {
        // Test case 1: The option has a long name.
        when(mockOption.hasLongOpt()).thenReturn(true);
        assertTrue(mockOption.hasLongOpt());

        // Test case 2: The option does not have a long name.
        when(mockOption.hasLongOpt()).thenReturn(false);
        assertFalse(mockOption.hasLongOpt());

        // Test case 3: The option has a null long name.
        when(mockOption.hasLongOpt()).thenReturn(false);
        assertFalse(mockOption.hasLongOpt());
    }
}