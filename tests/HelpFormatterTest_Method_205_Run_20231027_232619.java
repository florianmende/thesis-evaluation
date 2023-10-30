package org.apache.commons.cli;

import org.apache.commons.cli.HelpFormatter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HelpFormatterTest_Method_205_Run_20231027_232619 {
    @Test
    void testNullOrEmptyInput() {
        HelpFormatter formatter = new HelpFormatter();
        String input = null;
        String output = formatter.rtrim(input);
        assertEquals(input, output);

        input = "";
        output = formatter.rtrim(input);
        assertEquals(input, output);
    }

    @Test
    void testWhitespaceOnlyInput() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "   ";
        String output = formatter.rtrim(input);
        assertEquals("", output);
    }

    @Test
    void testMixedInput() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "hello world   ";
        String output = formatter.rtrim(input);
        assertEquals("hello world", output);
    }
}