package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class GnuParserTest_Method_63_Run_20231023_214133 {
    @Test
    void testFlattenEmptyArguments() {
        GnuParser parser = new GnuParser();
        Options options = mock(Options.class);
        String[] arguments = new String[0];
        String[] expected = new String[0];
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFlattenOnlyOptionArguments() {
        GnuParser parser = new GnuParser();
        Options options = mock(Options.class);
        String[] arguments = new String[] {"-a", "-b"};
        String[] expected = new String[] {"-a", "-b"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFlattenMixedArguments() {
        GnuParser parser = new GnuParser();
        Options options = mock(Options.class);
        String[] arguments = new String[] {"-a", "arg1", "-b", "arg2"};
        String[] expected = new String[] {"-a", "arg1", "-b", "arg2"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}