package org.apache.commons.cli;

import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class GnuParserTest_Method_63_Run_20231024_080105 {

    @Test
    void testFlattenEmptyArray() {
        String[] input = new String[0];
        String[] expected = new String[0];
        String[] actual = new GnuParser().flatten(new Options(), input, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFlattenNonOptionArguments() {
        String[] input = new String[]{"arg1", "arg2", "arg3"};
        String[] expected = new String[]{"arg1", "arg2", "arg3"};
        String[] actual = new GnuParser().flatten(new Options(), input, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFlattenMixedArguments() {
        String[] input = new String[]{"-a", "arg1", "-b", "arg2", "-c", "arg3"};
        String[] expected = new String[]{"-a", "arg1", "-b", "arg2", "-c", "arg3"};
        String[] actual = new GnuParser().flatten(new Options(), input, false);
        assertArrayEquals(expected, actual);
    }
}