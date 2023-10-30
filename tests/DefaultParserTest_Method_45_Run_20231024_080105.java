package org.apache.commons.cli;


import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DefaultParserTest_Method_45_Run_20231024_080105 {
    @Test
    public void testHandleTokenOption() throws ParseException {
        // Set up the parser and options
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("d", "debug", false, "Turn on debug.");
        options.addOption("e", "extract", false, "Turn on extract.");

        // Create a command line with the options
        CommandLine cmd = parser.parse(options, new String[]{"-d", "-e"});

        // Test that the options are parsed correctly
        assertEquals("debug", cmd.getOptionValue("d", "debug"));
        assertEquals("extract", cmd.getOptionValue("e", "extract"));
    }

    @Test
    public void testHandleTokenArgument() throws ParseException {
        // Set up the parser and options
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption("o", "option", true, "Turn on option with argument.");

        // Create a command line with the option and argument
        CommandLine cmd = parser.parse(options, new String[]{"-o", "argument"});

        // Test that the option and argument are parsed correctly
        assertEquals("argument", cmd.getOptionValue("o"));
    }

    @Test
    public void testHandleTokenUnknown() throws ParseException {
        // Set up the parser and options
        DefaultParser parser = new DefaultParser();
        Options options = new Options();

        // Create a command line with an unknown token
        CommandLine cmd = parser.parse(options, new String[]{"unknown"});

        // Test that the unknown token is added to the command line's argument list
        assertEquals("unknown", cmd.getArgList().get(0));
    }
}