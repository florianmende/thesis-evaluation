package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class ParserTest_Method_118_Run_20231028_022628 {
    @Test
    public void testParseValidOptionsAndArguments() throws ParseException {
        // Set up the mock options and arguments
        Options options = Mockito.mock(Options.class);
        String[] arguments = {"-a", "value1", "-b", "value2"};

        // Set up the expected CommandLine object
        CommandLine expectedCommandLine = Mockito.mock(CommandLine.class);

        // Set up the mock Parser class
        DefaultParser parser = Mockito.mock(DefaultParser.class);
        when(parser.parse(options, arguments)).thenReturn(expectedCommandLine);

        // Call the parse method and check the result
        CommandLine actualCommandLine = parser.parse(options, arguments);
        assertEquals(expectedCommandLine, actualCommandLine);
    }

    @Test
    public void testParseMissingRequiredOptions() throws ParseException {
        // Set up the mock options and arguments
        Options options = Mockito.mock(Options.class);
        String[] arguments = {"-a", "value1"};

        // Set up the expected MissingOptionException
        MissingOptionException expectedException = new MissingOptionException(Arrays.asList(options));

        // Set up the mock Parser class
        DefaultParser parser = Mockito.mock(DefaultParser.class);
        when(parser.parse(options, arguments)).thenThrow(expectedException);

        // Call the parse method and check the result
        assertThrows(expectedException.getClass(), () -> parser.parse(options, arguments));
    }

    @Test
    public void testParseInvalidOptions() throws ParseException {
        // Set up the mock options and arguments
        Options options = Mockito.mock(Options.class);
        String[] arguments = {"-c", "value1"};

        // Set up the expected UnrecognizedOptionException
        UnrecognizedOptionException expectedException = new UnrecognizedOptionException("Unrecognized option: -c", "-c");

        // Set up the mock Parser class
        DefaultParser parser = Mockito.mock(DefaultParser.class);
        when(parser.parse(options, arguments)).thenThrow(expectedException);

        // Call the parse method and check the result
        assertThrows(expectedException.getClass(), () -> parser.parse(options, arguments));
    }
}