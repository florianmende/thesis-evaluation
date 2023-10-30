package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class UtilTest_Method_61_Run_20231025_121248 {

    @Test
    public void testStripLeadingHyphens() {
        // Test case 1: input string is null
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Test case 2: input string starts with two hyphens
        input = "--hello";
        expected = "hello";
        actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Test case 3: input string starts with one hyphen
        input = "-hello";
        expected = "hello";
        actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }
}