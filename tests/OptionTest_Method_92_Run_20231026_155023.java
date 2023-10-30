package org.apache.commons.cli;

import org.apache.commons.cli.Option;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class OptionTest_Method_92_Run_20231026_155023 {
    @Test
    public void testHasArgs() {
        Option option = Mockito.mock(Option.class);
        when(option.hasArgs()).thenReturn(true);
        assertTrue(option.hasArgs());
    }
}