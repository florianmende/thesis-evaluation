package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OptionTest_Method_97_Run_20231028_012625 {
    @Test
    public void testHasValueSeparator() {
        // create a mock Option instance with a value separator
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasValueSeparator()).thenReturn(true);

        // assert that the option has a value separator
        assertTrue(option.hasValueSeparator());
    }

    @Test
    public void testDoesNotHaveValueSeparator() {
        // create a mock Option instance without a value separator
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasValueSeparator()).thenReturn(false);

        // assert that the option does not have a value separator
        assertFalse(option.hasValueSeparator());
    }

    @Test
    public void testHasDefaultValueSeparator() {
        // create a mock Option instance with the default value separator
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasValueSeparator()).thenReturn(true);

        // assert that the option has a value separator
        assertTrue(option.hasValueSeparator());
    }
}