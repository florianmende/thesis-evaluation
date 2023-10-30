package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.apache.commons.cli.HelpFormatter;

public class HelpFormatterTest_Method_205_Run_20231025_105031 {
    @Test
    public void testRtrim() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "Hello, world! ";
        String expected = "Hello, world!";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimWithOnlyTrailingWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "   ";
        String expected = "";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimWithMixedTrailingAndNonTrailingWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "Hello, world!   ";
        String expected = "Hello, world!";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }
}