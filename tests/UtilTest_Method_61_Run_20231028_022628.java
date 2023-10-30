package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UtilTest_Method_61_Run_20231028_022628 {

    @Test
    void testStripLeadingHyphens() {
        Util util = new Util();

        // Test case 1: string does not start with hyphens
        String input = "hello";
        String expected = "hello";
        String actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Test case 2: string starts with a single hyphen
        input = "-hello";
        expected = "hello";
        actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);

        // Test case 3: string starts with two hyphens
        input = "--hello";
        expected = "hello";
        actual = util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }
}