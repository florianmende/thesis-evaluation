package org.apache.commons.cli;


import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BasicParserTest_Method_226_Run_20231025_193245 {

    @Test
    public void testFlattenEmptyArguments() {
        // Create a mock Options object
        Options options = Mockito.mock(Options.class);

        // Create a BasicParser object with the mock Options object
        BasicParser parser = new BasicParser();

        // Call the flatten method with an empty arguments array
        String[] arguments = parser.flatten(options, new String[0], false);

        // Assert that the returned array is empty
        assertArrayEquals(new String[0], arguments);
    }

    @Test
    public void testFlattenOptionArguments() {
        // Create a mock Options object
        Options options = Mockito.mock(Options.class);

        // Create a BasicParser object with the mock Options object
        BasicParser parser = new BasicParser();

        // Call the flatten method with an arguments array containing only option arguments
        String[] arguments = parser.flatten(options, new String[]{"-a", "-b"}, false);

        // Assert that the returned array contains the same option arguments
        assertArrayEquals(new String[]{"-a", "-b"}, arguments);
    }

    @Test
    public void testFlattenMixedArguments() {
        // Create a mock Options object
        Options options = Mockito.mock(Options.class);

        // Create a BasicParser object with the mock Options object
        BasicParser parser = new BasicParser();

        // Call the flatten method with an arguments array containing both option and non-option arguments
        String[] arguments = parser.flatten(options, new String[]{"-a", "-b", "arg1", "arg2"}, false);

        // Assert that the returned array contains the same option and non-option arguments
        assertArrayEquals(new String[]{"-a", "-b", "arg1", "arg2"}, arguments);
    }
}