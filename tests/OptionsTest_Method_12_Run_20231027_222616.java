package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class OptionsTest_Method_12_Run_20231027_222616 {
    @Test
    void testGetRequiredOptions_noOptions() {
        Options options = Mockito.mock(Options.class);
        when(options.getRequiredOptions()).thenReturn(new ArrayList<>());
        assertEquals(new ArrayList<>(), options.getRequiredOptions());
    }

    @Test
    void testGetRequiredOptions_requiredOptions() {
        Options options = Mockito.mock(Options.class);
        List<Option> requiredOptions = new ArrayList<>();
        requiredOptions.add(new Option("a", "opt1", true, ""));
        requiredOptions.add(new Option("b", "opt2", true, ""));
        when(options.getRequiredOptions()).thenReturn(requiredOptions);
        assertEquals(requiredOptions, options.getRequiredOptions());
    }

    @Test
    void testGetRequiredOptions_nonRequiredOptions() {
        Options options = Mockito.mock(Options.class);
        List<Option> nonRequiredOptions = new ArrayList<>();
        nonRequiredOptions.add(new Option("a", "opt1", true, ""));
        nonRequiredOptions.add(new Option("b", "opt2", true, ""));
        when(options.getRequiredOptions()).thenReturn(nonRequiredOptions);
        assertEquals(nonRequiredOptions, options.getRequiredOptions());
    }
}