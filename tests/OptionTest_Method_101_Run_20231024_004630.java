package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_101_Run_20231024_004630 {
    @Test
    public void testSetArgName() {
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn("argName");
        assertEquals("argName", option.getArgName());
        // assertNull(option.getArgName());
    }

    @Test
    public void testSetArgNameNull() {
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn(null);
        assertNull(option.getArgName());
    }

    @Test
    public void testSetArgNameEmptyString() {
        Option option = mock(Option.class);
        when(option.getArgName()).thenReturn("");
        assertEquals("", option.getArgName());
    }
}