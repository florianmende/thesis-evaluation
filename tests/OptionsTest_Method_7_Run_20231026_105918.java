package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionsTest_Method_7_Run_20231026_105918 {
    @Test
    public void testGetMatchingOptionsEmptyList() {
        Options options = new Options();
        List<String> matchingOptions = options.getMatchingOptions("invalid");
        assertEquals(0, matchingOptions.size());
    }

    @Test
    public void testGetMatchingOptionsSingleOption() {
        Options options = new Options();
        options.addOption(new Option("a", "long-a", false, "description"));
        List<String> matchingOptions = options.getMatchingOptions("long-a");
        assertEquals(1, matchingOptions.size());
        assertEquals("long-a", matchingOptions.get(0));
    }

    @Test
    public void testGetMatchingOptionsMultipleOptions() {
        Options options = new Options();
        options.addOption(new Option("a", "long-a", false, "description"));
        options.addOption(new Option("b", "long-b", false, "description"));
        options.addOption(new Option("c", "long-c", false, "description"));
        List<String> matchingOptions = options.getMatchingOptions("long-");
        assertEquals(3, matchingOptions.size());
        assertTrue(matchingOptions.contains("long-a"));
        assertTrue(matchingOptions.contains("long-b"));
        assertTrue(matchingOptions.contains("long-c"));
    }
}