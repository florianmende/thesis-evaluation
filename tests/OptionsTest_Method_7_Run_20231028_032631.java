package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

class OptionsTest_Method_7_Run_20231028_032631 {
    @Test
    void testGetMatchingOptions() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "description of aaa");
        options.addOption("b", "bbb", true, "description of bbb");
        options.addOption("c", "ccc", false, "description of ccc");

        List<String> matchingOptions = options.getMatchingOptions("aa");
        assertEquals(1, matchingOptions.size());
        assertEquals("aaa", matchingOptions.get(0));

        matchingOptions = options.getMatchingOptions("bb");
        assertEquals(1, matchingOptions.size());
        assertEquals("bbb", matchingOptions.get(0));

        matchingOptions = options.getMatchingOptions("cc");
        assertEquals(1, matchingOptions.size());
        assertEquals("ccc", matchingOptions.get(0));

        matchingOptions = options.getMatchingOptions("d");
        assertTrue(matchingOptions.isEmpty());
    }
}