package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.cli.Option;

class OptionTest_Method_77_Run_20231024_004630 {
    @Test
    void testGetArgs() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(1);
        assertEquals(1, option.getArgs());
    }

    @Test
    void testGetArgsUninitialized() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNINITIALIZED);
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    void testGetArgsUnlimitedValues() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }
}