package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class OptionTest_Method_76_Run_20231025_121248 {
    @Test
    public void testGetArgName() {
        Option option = Mockito.mock(Option.class);
        when(option.getArgName()).thenReturn("argName");
        assertEquals("argName", option.getArgName());

        when(option.getArgName()).thenReturn(null);
        assertEquals(null, option.getArgName());

        when(option.getArgName()).thenReturn("");
        assertEquals("", option.getArgName());
    }
}