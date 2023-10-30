package org.apache.commons.cli;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelpFormatterTest_Method_205_Run_20231027_212614 {
    @Test
    public void testRtrimNull() {
        HelpFormatter formatter = new HelpFormatter();
        String input = null;
        String expected = null;
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimEmpty() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "";
        String expected = "";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimWhitespace() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "   ";
        String expected = "";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testRtrimMixed() {
        HelpFormatter formatter = new HelpFormatter();
        String input = "hello world   ";
        String expected = "hello world";
        String actual = formatter.rtrim(input);
        assertEquals(expected, actual);
    }
}