package org.apache.commons.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DefaultParserTest_Method_34_Run_20231025_125643 {

    @Test
    public void testCheckRequiredArgsCase1() throws ParseException {
        Option option = new Option("a", "arg", true, "This is an argument");
        Options options = new Options();
        options.addOption(option);
        CommandLine cmd = new DefaultParser().parse(options, new String[] {"-a", "arg"});
        assertEquals(1, cmd.getOptions().length);
        assertEquals(option, cmd.getOptions()[0]);
    }

    @Test
    public void testCheckRequiredArgsCase2() throws ParseException {
        Option option = new Option("a", "arg", false, "This is an argument");
        Options options = new Options();
        options.addOption(option);
        CommandLine cmd = new DefaultParser().parse(options, new String[] {"-a"});
        assertEquals(1, cmd.getOptions().length);
        assertEquals(option, cmd.getOptions()[0]);
    }

    @Test
    public void testCheckRequiredArgsCase3() throws ParseException {
        Option option = new Option("a", "arg", true, "This is an argument");
        Options options = new Options();
        options.addOption(option);
        try {
            CommandLine cmd = new DefaultParser().parse(options, new String[] {"-a"});
            fail("Expected MissingArgumentException");
        } catch (MissingArgumentException ex) {
            assertEquals("Missing argument for option: a", ex.getMessage());
        }
    }
}