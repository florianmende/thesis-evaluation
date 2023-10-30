package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_91_Run_20231028_022628 {
    @Test
    public void testHasArgName() {
        // case 1: the Option instance has an argument name
        Option option = mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());

        // case 2: the Option instance does not have an argument name
        option = mock(Option.class);
        when(option.hasArgName()).thenReturn(false);
        assertFalse(option.hasArgName());

        // case 3: the Option instance has an argument name that is an empty string
        option = mock(Option.class);
        when(option.hasArgName()).thenReturn(true);
        assertTrue(option.hasArgName());
    }
}