package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class UtilTest_Method_61_Run_20231028_042634 {

    @Test
    void testStripLeadingHyphens_NullInput() {
        String input = null;
        String expectedOutput = null;
        String actualOutput = Util.stripLeadingHyphens(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testStripLeadingHyphens_DoubleHyphenInput() {
        String input = "--hello";
        String expectedOutput = "hello";
        String actualOutput = Util.stripLeadingHyphens(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testStripLeadingHyphens_SingleHyphenInput() {
        String input = "-hello";
        String expectedOutput = "hello";
        String actualOutput = Util.stripLeadingHyphens(input);
        assertEquals(expectedOutput, actualOutput);
    }
}