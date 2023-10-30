package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;

public class OptionTest_Method_77_Run_20231024_145023 {
    @Test
    public void testGetArgs() {
        Option option = mock(Option.class);

        // Case 1: The option can take one argument value
        when(option.getArgs()).thenReturn(1);
        assertEquals(1, option.getArgs());

        // Case 2: The option can take multiple argument values
        when(option.getArgs()).thenReturn(3);
        assertEquals(3, option.getArgs());

        // Case 3: The option does not take any argument values
        when(option.getArgs()).thenReturn(0);
        assertEquals(0, option.getArgs());
    }
}