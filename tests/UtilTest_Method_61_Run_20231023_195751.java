package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UtilTest_Method_61_Run_20231023_195751 {
    private Util util = new Util();

    @Test
    void testStripLeadingHyphens() {
        // Test case 1: Null input
        assertNull(util.stripLeadingHyphens(null));

        // Test case 2: Empty string
        assertEquals("", util.stripLeadingHyphens(""));

        // Test case 3: String with hyphens
        assertEquals("one two", util.stripLeadingHyphens("--one two"));
        assertEquals("one two", util.stripLeadingHyphens("-one two"));
        assertEquals("one two", util.stripLeadingHyphens("one two"));

        // Test case 4: String without hyphens
        assertEquals("one two", util.stripLeadingHyphens("one two"));
    }
}