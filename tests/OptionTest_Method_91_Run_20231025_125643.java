package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_91_Run_20231025_125643 {
    @Test
    void testHasArgNameNull() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    void testHasArgNameEmpty() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    void testHasArgNameNotEmpty() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }
}