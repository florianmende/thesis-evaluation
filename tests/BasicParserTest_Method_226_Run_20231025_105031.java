package org.apache.commons.cli;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BasicParserTest_Method_226_Run_20231025_105031 {

    @Test
    public void testFlatten() {
        // create mock options and arguments
        Options options = mock(Options.class);
        String[] arguments = new String[] {"arg1", "arg2", "arg3"};

        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // call the flatten method and verify the result
        String[] flattenedArguments = parser.flatten(options, arguments, false);
        assertArrayEquals(arguments, flattenedArguments);
    }

    @Test
    public void testFlattenWithStopAtNonOption() {
        // create mock options and arguments
        Options options = mock(Options.class);
        String[] arguments = new String[] {"arg1", "arg2", "arg3"};

        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // call the flatten method with stopAtNonOption set to true
        String[] flattenedArguments = parser.flatten(options, arguments, true);

        // verify that the flattened arguments are the same as the original arguments
        assertArrayEquals(arguments, flattenedArguments);
    }

    @Test
    public void testFlattenWithDifferentOptions() {
        // create mock options and arguments
        Options options = mock(Options.class);
        String[] arguments = new String[] {"arg1", "arg2", "arg3"};

        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // call the flatten method with different options
        String[] flattenedArguments = parser.flatten(options, arguments, false);

        // verify that the flattened arguments are the same as the original arguments
        assertArrayEquals(arguments, flattenedArguments);
    }
}