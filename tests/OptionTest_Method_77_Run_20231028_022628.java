package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

class OptionTest_Method_77_Run_20231028_022628 {
    @Test
    void testGetArgs_noArguments() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(0);
        assertEquals(0, option.getArgs());
    }

    @Test
    void testGetArgs_oneArgument() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(1);
        assertEquals(1, option.getArgs());
    }

    @Test
    void testGetArgs_unlimitedArguments() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }
}