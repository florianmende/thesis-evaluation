package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.Collections;

import org.apache.commons.cli.Options;

public class OptionsTest_Method_11_Run_20231025_100630 {
    @Test
    public void testGetOptionsEmpty() {
        Options options = Mockito.mock(Options.class);
        Collection<Option> result = options.getOptions();
        assertEquals(0, result.size());
    }

    @Test
    public void testGetOptionsShortOnly() {
        Options options = Mockito.mock(Options.class);
        Option shortOption = new Option("a", "short option");
        Mockito.when(options.getOptions()).thenReturn(Collections.singletonList(shortOption));
        Collection<Option> result = options.getOptions();
        assertEquals(1, result.size());
        assertEquals(shortOption, result.iterator().next());
    }

    @Test
    public void testGetOptionsLongOnly() {
        Options options = Mockito.mock(Options.class);
        Option longOption = new Option("long", "long option");
        Mockito.when(options.getOptions()).thenReturn(Collections.singletonList(longOption));
        Collection<Option> result = options.getOptions();
        assertEquals(1, result.size());
        assertEquals(longOption, result.iterator().next());
    }
}