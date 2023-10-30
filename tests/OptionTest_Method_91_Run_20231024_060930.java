package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_91_Run_20231024_060930 {

    @Test
    public void testHasArgName_withArgName() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }

    @Test
    public void testHasArgName_withoutArgName() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgName_withEmptyArgName() {
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }
}