package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class BasicParserTest_Method_226_Run_20231025_224954 {
    @Test
    public void testFlatten() {
        // Create a mock Options object
        Options options = Mockito.mock(Options.class);

        // Create a mock String array of command line arguments
        String[] arguments = new String[]{"-a", "--long", "arg1", "arg2"};

        // Create a mock boolean flag indicating whether to stop flattening when a non-option is found
        boolean stopAtNonOption = false;

        // Call the flatten method with the mock objects
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);

        // Assert that the result is equal to the original arguments array
        assertEquals(arguments, result);
    }

    @Test
    public void testFlattenWithStopAtNonOption() {
        // Create a mock Options object
        Options options = Mockito.mock(Options.class);

        // Create a mock String array of command line arguments
        String[] arguments = new String[]{"-a", "--long", "arg1", "arg2"};

        // Create a mock boolean flag indicating whether to stop flattening when a non-option is found
        boolean stopAtNonOption = true;

        // Call the flatten method with the mock objects
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);

        // Assert that the result is equal to the original arguments array
        assertEquals(arguments, result);
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        // Create a mock Options object
        Options options = Mockito.mock(Options.class);

        // Create a mock String array of command line arguments
        String[] arguments = new String[]{};

        // Create a mock boolean flag indicating whether to stop flattening when a non-option is found
        boolean stopAtNonOption = false;

        // Call the flatten method with the mock objects
        String[] result = new BasicParser().flatten(options, arguments, stopAtNonOption);

        // Assert that the result is equal to the original arguments array
        assertEquals(arguments, result);
    }
}