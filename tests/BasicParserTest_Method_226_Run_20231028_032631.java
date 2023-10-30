package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;

public class BasicParserTest_Method_226_Run_20231028_032631 {
    @Test
    public void testFlatten() {
        // Test case 1: stopAtNonOption is false
        Options options = Mockito.mock(Options.class);
        String[] arguments = new String[] {"-a", "-b", "--long-option"};
        boolean stopAtNonOption = false;
        String[] expected = arguments;
        String[] actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertArrayEquals(expected, actual);

        // Test case 2: arguments array is empty
        options = Mockito.mock(Options.class);
        arguments = new String[] {};
        stopAtNonOption = false;
        expected = new String[] {};
        actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertArrayEquals(expected, actual);

        // Test case 3: arguments array contains only options
        options = Mockito.mock(Options.class);
        arguments = new String[] {"-a", "-b", "--long-option"};
        stopAtNonOption = false;
        expected = arguments;
        actual = new BasicParser().flatten(options, arguments, stopAtNonOption);
        Assertions.assertArrayEquals(expected, actual);
    }
}