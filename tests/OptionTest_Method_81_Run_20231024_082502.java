package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_81_Run_20231024_082502 {
    @Test
    public void testGetLongOpt() {
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("long-option");
        assertEquals("long-option", option.getLongOpt());

        option = mock(Option.class);
        when(option.getLongOpt()).thenReturn(null);
        assertNull(option.getLongOpt());

        option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("option");
        assertEquals("option", option.getLongOpt());
    }
}