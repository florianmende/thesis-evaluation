package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_78_Run_20231024_080105 {
    @Test
    public void testGetDescription() {
        // Case 1: The option has a description
        Option option = mock(Option.class);
        when(option.getDescription()).thenReturn("This is a description");
        assertEquals("This is a description", option.getDescription());

        // Case 2: The option does not have a description
        option = mock(Option.class);
        when(option.getDescription()).thenReturn("");
        assertEquals("", option.getDescription());

        // Case 3: The option has a null description
        option = mock(Option.class);
        when(option.getDescription()).thenReturn(null);
        assertNull(option.getDescription());
    }
}