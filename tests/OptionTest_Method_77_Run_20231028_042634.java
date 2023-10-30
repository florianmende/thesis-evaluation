package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Option.Builder;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_77_Run_20231028_042634 {

    @Test
    public void testGetArgsNoArgs() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(0);
        assertEquals(0, option.getArgs());
    }

    @Test
    public void testGetArgsOneArg() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(1);
        assertEquals(1, option.getArgs());
    }

    @Test
    public void testGetArgsUnlimitedArgs() {
        Option option = mock(Option.class);
        when(option.getArgs()).thenReturn(-2);
        assertEquals(-2, option.getArgs());
    }
}