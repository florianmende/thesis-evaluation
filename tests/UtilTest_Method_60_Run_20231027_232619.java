package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class UtilTest_Method_60_Run_20231027_232619 {
    @Test
    void testStripLeadingAndTrailingQuotes_EmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testStripLeadingAndTrailingQuotes_OneCharacter() {
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testStripLeadingAndTrailingQuotes_MultipleCharacters() {
        String input = "\"abc\"";
        String expectedOutput = "abc";
        String actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);
    }
}