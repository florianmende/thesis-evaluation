package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_7_Run_20231028_022628 {
    @Test
    public void testGetMatchingOptions_emptyList() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.getMatchingOptions("foo")).thenReturn(new ArrayList<>());
        List<String> result = options.getMatchingOptions("foo");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetMatchingOptions_singleElementList() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.getMatchingOptions("foo")).thenReturn(Collections.singletonList("foo"));
        List<String> result = options.getMatchingOptions("foo");
        assertEquals(1, result.size());
        assertEquals("foo", result.get(0));
    }

    @Test
    public void testGetMatchingOptions_multipleElementList() {
        Options options = Mockito.mock(Options.class);
        Mockito.when(options.getMatchingOptions("foo")).thenReturn(Arrays.asList("foo", "foobar", "fooey"));
        List<String> result = options.getMatchingOptions("foo");
        assertEquals(3, result.size());
        assertTrue(result.contains("foo"));
        assertTrue(result.contains("foobar"));
        assertTrue(result.contains("fooey"));
    }
}