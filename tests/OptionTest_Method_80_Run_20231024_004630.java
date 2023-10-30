package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_80_Run_20231024_004630 {
    @Test
    public void testGetKey() {
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("shortOption");
        assertEquals("shortOption", option.getKey());

        when(option.getKey()).thenReturn("longOption");
        assertEquals("longOption", option.getKey());

        when(option.getKey()).thenReturn(null);
        assertEquals(null, option.getKey());
    }
}