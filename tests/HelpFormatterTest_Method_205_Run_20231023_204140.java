package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class HelpFormatterTest_Method_205_Run_20231023_204140 {

    @Test
    public void testRtrim() {
        HelpFormatter formatter = new HelpFormatter();

        // Case 1: String without whitespace
        String input = "Hello";
        String expected = "Hello";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);

        // Case 2: String with trailing whitespace
        input = "Hello World ";
        expected = "Hello World";
        actual = formatter.rtrim(input);
        assertEquals(expected, actual);

        // Case 3: Null or empty string
        input = null;
        expected = null;
        actual = formatter.rtrim(input);
        assertNull(actual);

        input = "";
        expected = "";
        actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }
}