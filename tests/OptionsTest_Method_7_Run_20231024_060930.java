package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class OptionsTest_Method_7_Run_20231024_060930 {

    @Test
    public void testGetMatchingOptions_PerfectMatch() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "Option a");
        options.addOption("b", "bbb", false, "Option b");
        options.addOption("c", "ccc", false, "Option c");

        List<String> matchingOpts = options.getMatchingOptions("aaa");

        assertEquals(1, matchingOpts.size());
        assertTrue(matchingOpts.contains("aaa"));
    }

    @Test
    public void testGetMatchingOptions_PartialMatch() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "Option a");
        options.addOption("b", "bbb", false, "Option b");
        options.addOption("c", "ccc", false, "Option c");

        List<String> matchingOpts = options.getMatchingOptions("a");

        assertEquals(1, matchingOpts.size());
        assertTrue(matchingOpts.contains("aaa"));
    }

    @Test
    public void testGetMatchingOptions_NoMatch() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "Option a");
        options.addOption("b", "bbb", false, "Option b");
        options.addOption("c", "ccc", false, "Option c");

        List<String> matchingOpts = options.getMatchingOptions("z");

        assertEquals(0, matchingOpts.size());
    }
}