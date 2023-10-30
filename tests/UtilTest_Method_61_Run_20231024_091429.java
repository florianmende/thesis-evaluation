package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UtilTest_Method_61_Run_20231024_091429 {

    @Test
    public void testStripLeadingHyphens() {
        // Test case 1: null input
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Test case 2: empty input
        input = "";
        expected = "";
        actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Test case 3: input with hyphens
        input = "--hello";
        expected = "hello";
        actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }
}