package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_16_Run_20231027_212614 {
    @Test
    public void testHelpOptionsEmpty() {
        // Create an empty Options object
        Options options = new Options();

        // Call the helpOptions method
        List<Option> actual = options.helpOptions();

        // Assert that the returned list is empty
        assertTrue(actual.isEmpty());
    }

    @Test
    public void testHelpOptionsNonEmpty() {
        // Create a non-empty Options object
        Options options = new Options();
        options.addOption("a", "aaa", false, "Option A");
        options.addOption("b", "bbb", true, "Option B");

        // Call the helpOptions method
        List<Option> actual = options.helpOptions();

        // Assert that the returned list is not empty
        assertTrue(!actual.isEmpty());

        // Assert that the returned list contains the expected options
        assertEquals(2, actual.size());
        assertEquals("a", actual.get(0).getOpt());
        assertEquals("aaa", actual.get(0).getLongOpt());
        assertEquals("b", actual.get(1).getOpt());
        assertEquals("bbb", actual.get(1).getLongOpt());
    }

    @Test
    public void testHelpOptionsOrder() {
        // Create an Options object with options in a specific order
        Options options = new Options();
        options.addOption("b", "bbb", true, "Option B");
        options.addOption("a", "aaa", false, "Option A");

        // Call the helpOptions method
        List<Option> actual = options.helpOptions();

        // Assert that the returned list contains the options in the correct order
        assertEquals(2, actual.size());
        assertEquals("b", actual.get(0).getOpt());
        assertEquals("bbb", actual.get(0).getLongOpt());
        assertEquals("a", actual.get(1).getOpt());
        assertEquals("aaa", actual.get(1).getLongOpt());
    }
}