package org.apache.commons.cli;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelpFormatterTest_Method_205_Run_20231024_082502 {
    public static String rtrim(String str) {
        if (str == null) {
            return null;
        }
        return str.replaceAll("\\s+$", "");
    }

    @Test
    void testRtrim() {
        // Test case 1: null input
        assertEquals(null, rtrim(null));

        // Test case 2: empty input
        assertEquals("", rtrim(""));

        // Test case 3: input with only whitespace characters
        assertEquals("", rtrim("   "));

        // Test case 4: input with a mix of whitespace and non-whitespace characters
        assertEquals("hello", rtrim("hello   "));
    }
}