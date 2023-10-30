package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilTest_Method_60_Run_20231025_100630 {
    @Test
    void testStripLeadingAndTrailingQuotes() {
        // Test case 1: String with both leading and trailing quotes
        String input = "\"one two\"";
        String expectedOutput = "one two";
        String actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);

        // Test case 2: String with only leading quotes
        input = "\"one two";
        expectedOutput = "\"one two";
        actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);

        // Test case 3: String with only trailing quotes
        input = "one two\"";
        expectedOutput = "one two\"";
        actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);

        // Test case 4: String without quotes
        input = "one two";
        expectedOutput = "one two";
        actualOutput = Util.stripLeadingAndTrailingQuotes(input);
        assertEquals(expectedOutput, actualOutput);
    }
}