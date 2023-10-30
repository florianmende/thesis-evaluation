package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_91_Run_20231028_032631 {
    @Test
    public void testHasArgName() {
        // case 1: argument value is set, display name is also set
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());

        // case 2: argument value is set, display name is not set
        option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());

        // case 3: argument value is not set, display name is set
        option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }
}