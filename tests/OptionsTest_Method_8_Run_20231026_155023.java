package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_8_Run_20231026_155023 {
    @Test
    public void testGetOptionShortName() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("a");
        options.addOption(option);

        Option result = options.getOption("a");

        assertEquals(option, result);
    }

    @Test
    public void testGetOptionLongName() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("aa");
        options.addOption(option);

        Option result = options.getOption("aa");

        assertEquals(option, result);
    }

    @Test
    public void testGetOptionNotFound() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("a");
        options.addOption(option);

        Option result = options.getOption("b");

        assertNull(result);
    }
}