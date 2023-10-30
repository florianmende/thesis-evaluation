package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class OptionTest_Method_91_Run_20231025_105031 {

    @Test
    public void testHasArgName_null() {
        Option option = Mockito.mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_empty() {
        Option option = Mockito.mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }

    @Test
    public void testHasArgName_notEmpty() {
        Option option = Mockito.mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }
}