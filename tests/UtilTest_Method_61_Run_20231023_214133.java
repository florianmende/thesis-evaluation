package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilTest_Method_61_Run_20231023_214133 {

    @Test
    void testStripLeadingHyphens_NullInput() {
        String input = null;
        String expected = null;
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    void testStripLeadingHyphens_SingleHyphenInput() {
        String input = "-hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }

    @Test
    void testStripLeadingHyphens_DoubleHyphenInput() {
        String input = "--hello";
        String expected = "hello";
        String actual = Util.stripLeadingHyphens(input);
        assertEquals(expected, actual);
    }
}