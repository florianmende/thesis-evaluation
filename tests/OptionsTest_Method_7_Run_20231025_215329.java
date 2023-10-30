package org.apache.commons.cli;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List; // <-- Added import statement

public class OptionsTest_Method_7_Run_20231025_215329 {
    @Test
    public void testGetMatchingOptions() {
        Options options = new Options();
        options.addOption("a", "aaa", false, "description");
        options.addOption("b", "bbb", false, "description");
        options.addOption("c", "ccc", false, "description");

        // Test case 1: perfect match
        List<String> matchingOptions = options.getMatchingOptions("aaa");
        assertEquals(1, matchingOptions.size());
        assertEquals("aaa", matchingOptions.get(0));

        // Test case 2: partial match
        matchingOptions = options.getMatchingOptions("bb");
        assertEquals(1, matchingOptions.size());
        assertEquals("bbb", matchingOptions.get(0));

        // Test case 3: no match
        matchingOptions = options.getMatchingOptions("d");
        assertEquals(0, matchingOptions.size());
    }
}