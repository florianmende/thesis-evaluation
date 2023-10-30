package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

class HelpFormatterTest_Method_205_Run_20231025_125643 {
    @Test
    void testRtrim() {
        HelpFormatter formatter = new HelpFormatter();

        // Test case 1: Null input
        String input = null;
        String expected = null;
        String actual = formatter.rtrim(input);
        Assertions.assertEquals(expected, actual);

        // Test case 2: Empty input
        input = "";
        expected = "";
        actual = formatter.rtrim(input);
        Assertions.assertEquals(expected, actual);

        // Test case 3: Whitespace input
        input = "   ";
        expected = "";
        actual = formatter.rtrim(input);
        Assertions.assertEquals(expected, actual);

        // Test case 4: Mixed input
        input = "hello world   ";
        expected = "hello world";
        actual = formatter.rtrim(input);
        Assertions.assertEquals(expected, actual);
    }
}