package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_96_Run_20231025_215329 {
    @Test
    public void testHasOptionalArg() {
        Option option = mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(true);
        assertTrue(option.hasOptionalArg());

        option = mock(Option.class);
        when(option.hasOptionalArg()).thenReturn(false);
        assertFalse(option.hasOptionalArg());

        option = mock(Option.class);
        when(option.hasArg()).thenReturn(true);
        assertFalse(option.hasOptionalArg());
    }
}