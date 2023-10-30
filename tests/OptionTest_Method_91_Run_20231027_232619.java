package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionTest_Method_91_Run_20231027_232619 {
    @Test
    public void testHasArgName_notNullNotEmpty() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }

    @Test
    public void testHasArgName_null() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_emptyString() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }
}