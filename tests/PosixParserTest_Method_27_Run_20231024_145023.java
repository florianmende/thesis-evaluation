package org.apache.commons.cli;


import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosixParserTest_Method_27_Run_20231024_145023 {
    @Test
    public void testFlattenEmptyArguments() throws ParseException {
        Options options = new Options();
        PosixParser parser = new PosixParser();
        String[] arguments = new String[0];
        String[] expected = new String[0];
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenSingleArgument() throws ParseException {
        Options options = new Options();
        PosixParser parser = new PosixParser();
        String[] arguments = new String[]{"-a"};
        String[] expected = new String[]{"-a"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFlattenMultipleArguments() throws ParseException {
        Options options = new Options();
        PosixParser parser = new PosixParser();
        String[] arguments = new String[]{"-a", "-b", "-c"};
        String[] expected = new String[]{"-a", "-b", "-c"};
        String[] actual = parser.flatten(options, arguments, false);
        assertArrayEquals(expected, actual);
    }
}