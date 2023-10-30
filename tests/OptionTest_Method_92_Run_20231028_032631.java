package org.apache.commons.cli;



import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OptionTest_Method_92_Run_20231028_032631 {
    @Test
    public void testHasArgs_fixedNumberOfArgs() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgs()).thenReturn(true);
        Mockito.when(option.getArgs()).thenReturn(new Integer[] {1, 2}.length);

        assertTrue(option.hasArgs());
    }

    @Test
    public void testHasArgs_variableNumberOfArgs() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgs()).thenReturn(true);
        Mockito.when(option.getArgs()).thenReturn(new Integer[] {1, 2, 3}.length);

        assertTrue(option.hasArgs());
    }

    @Test
    public void testHasArgs_noArgs() {
        Option option = Mockito.mock(Option.class);
        Mockito.when(option.hasArgs()).thenReturn(false);
        Mockito.when(option.getArgs()).thenReturn(new Integer[0].length);

        assertFalse(option.hasArgs());
    }
}