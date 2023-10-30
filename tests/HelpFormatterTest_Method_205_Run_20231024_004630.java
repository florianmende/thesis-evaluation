package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class HelpFormatterTest_Method_205_Run_20231024_004630 {
    @Test
    public void testRtrim() {
        HelpFormatter formatter = new HelpFormatter();

        // Test case 1: null input
        assertNull(formatter.rtrim(null));

        // Test case 2: empty input
        assertEquals("", formatter.rtrim(""));

        // Test case 3: whitespace input
        assertEquals("", formatter.rtrim("   \t\n\r"));

        // Test case 4: mixed input
        assertEquals("hello", formatter.rtrim("hello   \t\n\r"));
    }
}