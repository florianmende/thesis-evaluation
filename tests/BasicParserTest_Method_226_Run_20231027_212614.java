package org.apache.commons.cli;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

@ExtendWith(MockitoExtension.class)
public class BasicParserTest_Method_226_Run_20231027_212614 {
    @Mock
    private Options options;

    @Test
    public void testFlatten() {
        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // define the input arguments
        String[] arguments = new String[] {"-a", "arg1", "-b", "arg2"};

        // call the flatten method and get the result
        String[] result = parser.flatten(options, arguments, false);

        // assert that the result is the same as the input arguments
        Assertions.assertArrayEquals(arguments, result);
    }

    @Test
    public void testFlattenWithStopAtNonOption() {
        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // define the input arguments
        String[] arguments = new String[] {"-a", "arg1", "--", "-b", "arg2"};

        // call the flatten method and get the result
        String[] result = parser.flatten(options, arguments, true);

        // assert that the result is the same as the input arguments
        Assertions.assertArrayEquals(arguments, result);
    }

    @Test
    public void testFlattenWithEmptyArguments() {
        // create a new BasicParser instance
        BasicParser parser = new BasicParser();

        // define the input arguments
        String[] arguments = new String[0];

        // call the flatten method and get the result
        String[] result = parser.flatten(options, arguments, false);

        // assert that the result is an empty array
        Assertions.assertArrayEquals(new String[0], result);
    }
}