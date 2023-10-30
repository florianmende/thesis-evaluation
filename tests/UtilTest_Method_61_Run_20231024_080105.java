package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Util;
import org.junit.jupiter.api.Test;

class UtilTest_Method_61_Run_20231024_080105 {

    @Test
    void testStripLeadingHyphens() {
        // Case 1: Input string is null
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Case 2: Input string starts with a single hyphen
        input = "-one";
        expected = "one";
        actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Case 3: Input string starts with a double hyphen
        input = "--one";
        expected = "one";
        actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }
}