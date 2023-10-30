package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_81_Run_20231025_100630 {

    @Test
    public void testGetLongOpt_shortName() {
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("long");
        assertEquals("long", option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_noLongName() {
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn(null);
        assertNull(option.getLongOpt());
    }

    @Test
    public void testGetLongOpt_sameAsShortName() {
        Option option = mock(Option.class);
        when(option.getLongOpt()).thenReturn("short");
        assertEquals("short", option.getLongOpt());
    }
}