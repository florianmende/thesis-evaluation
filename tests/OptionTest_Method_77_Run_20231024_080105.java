package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_77_Run_20231024_080105 {
    @Test
    public void testGetArgsFixedNumber() {
        // create an Option with a fixed number of arguments
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(2);

        // test that the method returns the correct number of arguments
        assertEquals(2, option.getArgs());
    }

    @Test
    public void testGetArgsUninitialized() {
        // create an Option with no fixed number of arguments
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNINITIALIZED);

        // test that the method returns UNINITIALIZED
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void testGetArgsUnlimited() {
        // create an Option with an unlimited number of arguments
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(Option.UNLIMITED_VALUES);

        // test that the method returns UNLIMITED_VALUES
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }
}