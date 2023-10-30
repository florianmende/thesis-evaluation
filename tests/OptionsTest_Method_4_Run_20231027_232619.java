package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_4_Run_20231027_232619 {
    @Test
    public void testAddOption() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        when(option.getLongOpt()).thenReturn("long");
        when(option.hasArg()).thenReturn(true);
        when(option.getDescription()).thenReturn("description");

        options.addOption(option);

        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionWithRequiredArg() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        when(option.getLongOpt()).thenReturn("long");
        when(option.hasArg()).thenReturn(true);
        when(option.getDescription()).thenReturn("description");

        options.addOption(option);

        assertEquals(1, options.getOptions().size());
        assertTrue(options.getOptions().contains(option));
    }

    @Test
    public void testAddOptionReturnsOptionsInstance() {
        Options options = new Options();
        Option option = mock(Option.class);
        when(option.getKey()).thenReturn("key");
        when(option.getLongOpt()).thenReturn("long");
        when(option.hasArg()).thenReturn(true);
        when(option.getDescription()).thenReturn("description");

        Options returnedOptions = options.addOption(option);

        assertEquals(options, returnedOptions);
    }
}