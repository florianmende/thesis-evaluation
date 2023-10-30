package org.apache.commons.cli;


import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicParserTest_Method_226_Run_20231030_094427 {

    @Test
    public void testFlatten() {
        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // test case 1: input arguments array is not empty
        String[] arguments = new String[] {"-a", "value1", "-b", "value2"};
        String[] expected = new String[] {"-a", "value1", "-b", "value2"};
        assertArrayEquals(expected, parser.flatten(new Options(), arguments, false));

        // test case 2: input arguments array is empty
        arguments = new String[0];
        expected = new String[0];
        assertArrayEquals(expected, parser.flatten(new Options(), arguments, false));

        // test case 3: input arguments array contains only options
        arguments = new String[] {"-a", "-b"};
        expected = new String[] {"-a", "-b"};
        assertArrayEquals(expected, parser.flatten(new Options(), arguments, false));
    }
}