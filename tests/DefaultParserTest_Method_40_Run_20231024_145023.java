package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefaultParserTest_Method_40_Run_20231024_145023 {

    @Test(expected = ParseException.class)
    public void testInvalidLongOption() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption(Option.builder("d").longOpt("debug").build());
        parser.parse(options, new String[] {"--invalid=value"});
    }

    @Test(expected = ParseException.class)
    public void testOptionDoesNotAcceptArgument() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption(Option.builder("d").longOpt("debug").build());
        parser.parse(options, new String[] {"--debug=value"});
    }

    @Test
    public void testOptionAcceptsArgument() throws ParseException {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption(Option.builder("d").longOpt("debug").hasArg().build());
        CommandLine cmd = parser.parse(options, new String[] {"--debug=value"});
        assertEquals("value", cmd.getOptionValue("debug"));
    }
}