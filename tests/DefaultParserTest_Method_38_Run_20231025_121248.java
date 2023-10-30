package org.apache.commons.cli;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.junit.jupiter.api.Test;

public class DefaultParserTest_Method_38_Run_20231025_121248 {

    @Test
    public void testSingleOption() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "Alpha option"));
        try {
            CommandLine cmd = parser.parse(options, new String[]{"-a"});
            assertEquals(1, cmd.getOptions().length);
            assertEquals("a", cmd.getOptions()[0].getOpt());
            assertEquals("alpha", cmd.getOptions()[0].getLongOpt());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testMultipleOptions() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "Alpha option"));
        options.addOption(new Option("b", "beta", false, "Beta option"));
        try {
            CommandLine cmd = parser.parse(options, new String[]{"-a", "-b"});
            assertEquals(2, cmd.getOptions().length);
            assertEquals("a", cmd.getOptions()[0].getOpt());
            assertEquals("alpha", cmd.getOptions()[0].getLongOpt());
            assertEquals("b", cmd.getOptions()[1].getOpt());
            assertEquals("beta", cmd.getOptions()[1].getLongOpt());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNonOption() {
        DefaultParser parser = new DefaultParser();
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "Alpha option"));
        try {
            CommandLine cmd = parser.parse(options, new String[]{"-a", "foo"});
            assertEquals(1, cmd.getOptions().length);
            assertEquals("a", cmd.getOptions()[0].getOpt());
            assertEquals("alpha", cmd.getOptions()[0].getLongOpt());
            assertEquals(1, cmd.getArgList().size());
            assertEquals("foo", cmd.getArgList().get(0));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}