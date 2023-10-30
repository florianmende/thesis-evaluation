package org.apache.commons.cli;


import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class OptionTest_Method_77_Run_20231025_125643 {
    @Test
    public void testGetArgsNoArguments() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getArgs()).thenReturn(0);
        Assertions.assertEquals(0, option.getArgs());
    }

    @Test
    public void testGetArgsOneArgument() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getArgs()).thenReturn(1);
        Assertions.assertEquals(1, option.getArgs());
    }

    @Test
    public void testGetArgsUnlimitedArguments() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.getArgs()).thenReturn(-2);
        Assertions.assertEquals(-2, option.getArgs());
    }
}