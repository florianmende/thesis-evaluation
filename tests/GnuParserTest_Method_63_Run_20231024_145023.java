package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyString;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class GnuParserTest_Method_63_Run_20231024_145023 {
    @Test
    public void testEmptyArguments() {
        GnuParser parser = new GnuParser();
        String[] arguments = new String[0];
        Options options = mock(Options.class);
        when(options.hasOption(anyString())).thenReturn(false);
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[0], result);
    }

    @Test
    public void testSingleCharacterStrings() {
        GnuParser parser = new GnuParser();
        String[] arguments = new String[] { "a", "b", "c" };
        Options options = mock(Options.class);
        when(options.hasOption(anyString())).thenReturn(false);
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[] { "a", "b", "c" }, result);
    }

    @Test
    public void testStringsStartingWithHyphens() {
        GnuParser parser = new GnuParser();
        String[] arguments = new String[] { "-a", "-b", "-c" };
        Options options = mock(Options.class);
        when(options.hasOption(anyString())).thenReturn(false);
        String[] result = parser.flatten(options, arguments, false);
        assertArrayEquals(new String[] { "-a", "-b", "-c" }, result);
    }
}