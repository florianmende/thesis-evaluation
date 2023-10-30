package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_91_Run_20231028_052637 {
    @Test
    public void testHasArgNameTrue() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }

    @Test
    public void testHasArgNameFalse() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }

    @Test
    public void testHasArgNameEmptyString() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());
    }
}