package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_11_Run_20231025_193245 {
    @Test
    public void testGetOptionsEmpty() {
        Options options = mock(Options.class);
        when(options.getOptions()).thenReturn(Collections.emptyList());
        Collection<Option> actual = options.getOptions();
        assertEquals(0, actual.size());
    }

    @Test
    public void testGetOptionsOne() {
        Options options = mock(Options.class);
        Option option = mock(Option.class);
        when(options.getOptions()).thenReturn(Collections.singletonList(option));
        Collection<Option> actual = options.getOptions();
        assertEquals(1, actual.size());
        assertTrue(actual.contains(option));
    }

    @Test
    public void testGetOptionsMultiple() {
        Options options = mock(Options.class);
        Option option1 = mock(Option.class);
        Option option2 = mock(Option.class);
        when(options.getOptions()).thenReturn(Arrays.asList(option1, option2));
        Collection<Option> actual = options.getOptions();
        assertEquals(2, actual.size());
        assertTrue(actual.contains(option1));
        assertTrue(actual.contains(option2));
    }
}