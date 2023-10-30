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

public class OptionsTest_Method_12_Run_20231023_214133 {
    @Test
    public void testGetRequiredOptionsEmpty() {
        Options options = mock(Options.class);
        when(options.getRequiredOptions()).thenReturn(new ArrayList<>());
        assertEquals(0, options.getRequiredOptions().size());
    }

    @Test
    public void testGetRequiredOptionsOneOption() {
        Options options = mock(Options.class);
        Option option = mock(Option.class);
        when(option.isRequired()).thenReturn(true);
        when(options.getRequiredOptions()).thenReturn(List.of(option));
        assertEquals(1, options.getRequiredOptions().size());
        assertTrue(options.getRequiredOptions().contains(option));
    }

    @Test
    public void testGetRequiredOptionsMultipleOptions() {
        Options options = mock(Options.class);
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(option1.isRequired()).thenReturn(true);
        when(option2.isRequired()).thenReturn(true);
        when(options.getRequiredOptions()).thenReturn(List.of(option1, option2));
        assertEquals(2, options.getRequiredOptions().size());
        assertTrue(options.getRequiredOptions().contains(option1));
        assertTrue(options.getRequiredOptions().contains(option2));
    }
}