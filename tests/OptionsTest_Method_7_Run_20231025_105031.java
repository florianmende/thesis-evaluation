package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OptionsTest_Method_7_Run_20231025_105031 {
    @Test
    public void testGetMatchingOptions() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "");
        options.addOption("b", "bbb", false, "");
        options.addOption("c", "ccc", false, "");

        List<String> matchingOptions = options.getMatchingOptions("a");
        assertEquals(1, matchingOptions.size());
        assertEquals("aaa", matchingOptions.get(0));

        matchingOptions = options.getMatchingOptions("b");
        assertEquals(1, matchingOptions.size());
        assertEquals("bbb", matchingOptions.get(0));

        matchingOptions = options.getMatchingOptions("c");
        assertEquals(1, matchingOptions.size());
        assertEquals("ccc", matchingOptions.get(0));

        matchingOptions = options.getMatchingOptions("d");
        assertEquals(0, matchingOptions.size());
    }
}