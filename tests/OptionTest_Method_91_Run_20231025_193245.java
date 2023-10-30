package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class OptionTest_Method_91_Run_20231025_193245 {
    @Test
    public void testHasArgName_Null() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_Empty() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_NotNullOrEmpty() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }
}