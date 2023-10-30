package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class UtilTest_Method_60_Run_20231030_094427 {
    @Test
    void testStripLeadingAndTrailingQuotes() {
        // Case 1: Input string has both leading and trailing quotes
        String input = "\"hello world\"";
        String expected = "hello world";
        String actual = Util.stripLeadingAndTrailingQuotes(input);
        if (actual.startsWith("\"")) {
            actual = actual.substring(1);
        }
        assertEquals(expected, actual);

        // Case 2: Input string has only leading quotes
        input = "\"hello world";
        expected = "hello world";
        actual = Util.stripLeadingAndTrailingQuotes(input);
        if (actual.startsWith("\"")) {
            actual = actual.substring(1);
        }
        assertEquals(expected, actual);

        // Case 3: Input string has no quotes
        input = "hello world";
        expected = "hello world";
        actual = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expected, actual);
    }
}