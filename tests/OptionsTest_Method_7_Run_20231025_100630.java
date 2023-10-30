package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_7_Run_20231025_100630 {
    @Test
    public void testGetMatchingOptionsPerfectMatch() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "bravo", false, "bravo option");
        options.addOption("c", "charlie", false, "charlie option");

        List<String> matchingOptions = options.getMatchingOptions("alpha");

        assertEquals(1, matchingOptions.size());
        assertTrue(matchingOptions.contains("alpha"));
    }

    @Test
    public void testGetMatchingOptionsPartialMatch() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "bravo", false, "bravo option");
        options.addOption("c", "charlie", false, "charlie option");

        List<String> matchingOptions = options.getMatchingOptions("al");

        assertEquals(1, matchingOptions.size());
        assertTrue(matchingOptions.contains("alpha"));
    }

    @Test
    public void testGetMatchingOptionsNoMatch() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "alpha option");
        options.addOption("b", "bravo", false, "bravo option");
        options.addOption("c", "charlie", false, "charlie option");

        List<String> matchingOptions = options.getMatchingOptions("delta");

        assertEquals(0, matchingOptions.size());
    }
}